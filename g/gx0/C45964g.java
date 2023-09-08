package gx0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fx0.C45829j;
import qj3.C47856a;

/* renamed from: gx0.g */
public class C45964g extends C47856a {

    /* renamed from: e */
    public static C47856a.C47858b f123975e;

    /* renamed from: d */
    public String f123976d;

    /* renamed from: gx0.g$a */
    public class C45965a extends C47856a.C47858b {
        public C45965a(C45964g gVar) {
        }

        /* renamed from: a */
        public void mo63542a(View view, C47856a.C47857a aVar) {
            if (view != null && aVar != null && (aVar instanceof C45966b)) {
                ((C45966b) aVar).f123977a = (TextView) view.findViewById(C0966R.C0970id.ay5);
            }
        }

        /* renamed from: b */
        public void mo63543b(Context context, C47856a.C47857a aVar, C47856a aVar2, Object... objArr) {
            if (context == null || aVar == null || aVar2 == null) {
                Log.m105920e("MicroMsg.CatalogDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            } else if (!(aVar instanceof C45966b)) {
                Log.m105920e("MicroMsg.CatalogDataItem", "The ViewHolder is not a instance of CatalogViewHolder.");
            } else if (!(aVar2 instanceof C45964g)) {
                Log.m105920e("MicroMsg.CatalogDataItem", "The DataItem is not a instance of CatalogDataItem.");
            } else {
                C45829j.m51129b(((C45966b) aVar).f123977a, ((C45964g) aVar2).f123976d);
            }
        }

        /* renamed from: c */
        public View mo63544c(Context context, ViewGroup viewGroup, View view) {
            return view == null ? View.inflate(context, C0966R.C0971layout.bvg, (ViewGroup) null) : view;
        }

        /* renamed from: d */
        public boolean mo63545d(Context context, View view, C47856a aVar, Object... objArr) {
            return true;
        }
    }

    /* renamed from: gx0.g$b */
    public static class C45966b implements C47856a.C47857a {

        /* renamed from: a */
        public TextView f123977a;
    }

    public C45964g(Object obj) {
        super(1, obj);
    }

    /* renamed from: a */
    public void mo63539a(Context context, C47856a.C47857a aVar, Object... objArr) {
        Object obj = this.f128456b;
        if (obj instanceof String) {
            this.f123976d = (String) obj;
        }
    }

    /* renamed from: b */
    public C47856a.C47857a mo63540b() {
        return new C45966b();
    }

    /* renamed from: c */
    public C47856a.C47858b mo63541c() {
        if (f123975e == null) {
            f123975e = new C45965a(this);
        }
        return f123975e;
    }
}
