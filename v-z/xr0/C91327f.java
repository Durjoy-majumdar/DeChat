package xr0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ArrayAdapter;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.sortlist.DragSortListView;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: xr0.f */
public final class C91327f extends ArrayAdapter<LocalUsageInfo> {

    /* renamed from: d */
    public final ArrayList<LocalUsageInfo> f261949d;

    /* renamed from: e */
    public DragSortListView f261950e;

    /* renamed from: f */
    public final C13601g f261951f;

    /* renamed from: g */
    public final C13601g f261952g;

    /* renamed from: xr0.f$a */
    public static final class C91328a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C91328a f261953d = new C91328a();

        public C91328a() {
            super(0);
        }

        public Object invoke() {
            return MMApplicationContext.getString(C0966R.string.by4);
        }
    }

    /* renamed from: xr0.f$b */
    public static final class C91329b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C91329b f261954d = new C91329b();

        public C91329b() {
            super(0);
        }

        public Object invoke() {
            return MMApplicationContext.getString(C0966R.string.f7910vz);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91327f(Context context, ArrayList<LocalUsageInfo> arrayList) {
        super(context, C0966R.C0971layout.f6394dn, arrayList);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(arrayList, "dataList");
        this.f261949d = arrayList;
        C13602i iVar = C13602i.PUBLICATION;
        this.f261951f = C36568h.m40986b(iVar, C91328a.f261953d);
        this.f261952g = C36568h.m40986b(iVar, C91329b.f261954d);
    }

    public long getItemId(int i) {
        LocalUsageInfo localUsageInfo = (LocalUsageInfo) getItem(i);
        StringBuilder sb = new StringBuilder();
        C87412m.m108591d(localUsageInfo);
        sb.append(localUsageInfo.f239040d);
        sb.append(localUsageInfo.f239042f);
        return (long) sb.toString().hashCode();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C91330j jVar;
        C87412m.m108594g(viewGroup, "parent");
        if (view == null || view.getTag() == null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            C87412m.m108593f(from, "from(context)");
            View inflate = from.inflate(C0966R.C0971layout.f6394dn, viewGroup, false);
            View inflate2 = ((ViewStub) inflate.findViewById(C0966R.C0970id.bsf)).inflate();
            if (inflate2 != null) {
                inflate2.setBackground((Drawable) null);
            }
            jVar = new C91330j(inflate);
        } else {
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.collection.CollectionSortViewHolder");
            jVar = (C91330j) tag;
        }
        Object item = getItem(i);
        C87412m.m108591d(item);
        jVar.mo125317y((LocalUsageInfo) item);
        jVar.f44854d.setClickable(false);
        jVar.f261956H.setContentDescription((String) this.f261951f.getValue());
        int i2 = i == getCount() + -1 ? 8 : 0;
        View view2 = jVar.f261957I;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder", "setBottomLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder", "setBottomLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jVar.f261956H.setOnClickListener(new C78971g(this, i));
        View view4 = jVar.f44854d;
        C87412m.m108593f(view4, "holder.itemView");
        return view4;
    }
}
