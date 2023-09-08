package xr0;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81243g;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.regex.Pattern;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import nj3.C11184p0;
import qo3.C77407n;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: xr0.m */
public class C91332m extends RecyclerView.C16631z implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: A */
    public final TextView f261960A;

    /* renamed from: B */
    public final ImageView f261961B;

    /* renamed from: C */
    public final View f261962C;

    /* renamed from: D */
    public final C91333a f261963D;

    /* renamed from: E */
    public final boolean f261964E = true;

    /* renamed from: F */
    public LocalUsageInfo f261965F;

    /* renamed from: z */
    public final TextView f261966z;

    /* renamed from: xr0.m$a */
    public interface C91333a {
        void onEnter();
    }

    /* renamed from: xr0.m$b */
    public static final class C91334b implements View.OnCreateContextMenuListener {
        public C91334b(String str) {
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(0, 0, 0, "打开小程序且path=?wechat_appbrand_test=1");
            contextMenu.add(0, 1, 0, C0966R.string.f7913w2);
        }
    }

    /* renamed from: xr0.m$c */
    public static final class C91335c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C91332m f261967d;

        /* renamed from: e */
        public final /* synthetic */ View f261968e;

        public C91335c(C91332m mVar, View view, String str) {
            this.f261967d = mVar;
            this.f261968e = view;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            LocalUsageInfo localUsageInfo;
            if (i == 0) {
                this.f261967d.mo125314C(this.f261968e, "?wechat_appbrand_test=1");
            } else if (i == 1 && (localUsageInfo = this.f261967d.f261965F) != null) {
                View view = this.f261968e;
                C87412m.m108591d(view);
                Context context = view.getContext();
                String str = localUsageInfo.f239040d;
                WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
                bVar.f239557a = localUsageInfo.f239041e;
                bVar.f239566j = 3;
                AppBrandProfileUI.m104017R7(context, str, 3, "", true, bVar.mo113977a(), (Bundle) null, (ActivityStarterIpcDelegate) null);
            }
        }
    }

    /* renamed from: xr0.m$d */
    public static final class C91336d implements C77407n.C47880p {

        /* renamed from: a */
        public static final C91336d f261969a = new C91336d();

        public final void onDismiss() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91332m(View view, C91333a aVar) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f261963D = aVar;
        view.setOnClickListener(this);
        if (mo125313B() && C78970e.m95478a()) {
            view.setOnLongClickListener(this);
        }
        View findViewById = view.findViewById(C0966R.C0970id.i2m);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.primary_text)");
        this.f261966z = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.kem);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.tag_text)");
        this.f261960A = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.f15);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.icon)");
        this.f261961B = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.c7p);
        C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.divider)");
        this.f261962C = findViewById4;
    }

    /* renamed from: B */
    public boolean mo125313B() {
        return this.f261964E;
    }

    /* renamed from: C */
    public final void mo125314C(View view, String str) {
        LocalUsageInfo localUsageInfo = this.f261965F;
        if (localUsageInfo != null) {
            C83428o oVar = C83428o.f243800a;
            C87412m.m108591d(view);
            Context context = view.getContext();
            String str2 = localUsageInfo.f239040d;
            String str3 = localUsageInfo.f239041e;
            int i = localUsageInfo.f239042f;
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            appBrandStatObject.f245533f = 1103;
            C13598b0 b0Var = C13598b0.f38549a;
            ((C83285a) oVar).mo115583c(context, str2, str3, str, i, 0, appBrandStatObject, (AppBrandLaunchReferrer) null, (LaunchParamsOptional) null);
            C91333a aVar = this.f261963D;
            if (aVar != null) {
                aVar.onEnter();
            }
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mo125314C(view, (String) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public boolean onLongClick(View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (C78970e.m95478a()) {
            C87412m.m108591d(view);
            new C45082x0(view.getContext()).mo70436b(view, new C91334b("?wechat_appbrand_test=1"), new C91335c(this, view, "?wechat_appbrand_test=1"), C91336d.f261969a);
            z = true;
        } else {
            z = false;
        }
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z;
    }

    /* renamed from: y */
    public final void mo125317y(LocalUsageInfo localUsageInfo) {
        C87412m.m108594g(localUsageInfo, "dataItem");
        this.f261965F = localUsageInfo;
        String a = C81243g.m99551a(localUsageInfo.f239042f);
        if (a == null || a.length() == 0) {
            this.f261960A.setVisibility(8);
        } else {
            this.f261960A.setVisibility(0);
            this.f261960A.setText(a);
        }
        mo125318z();
        String str = C88394b.f255384g;
        C88394b bVar = C88394b.C88418q.f255427a;
        ImageView imageView = this.f261961B;
        LocalUsageInfo localUsageInfo2 = this.f261965F;
        C87412m.m108591d(localUsageInfo2);
        bVar.mo122786b(imageView, localUsageInfo2.f239046j, C88393a.m110230a(), C88431k.f255437d);
    }

    /* renamed from: z */
    public final void mo125318z() {
        LocalUsageInfo localUsageInfo = this.f261965F;
        C87412m.m108591d(localUsageInfo);
        String str = localUsageInfo.f239044h;
        TextView textView = this.f261966z;
        if (str == null || str.length() == 0) {
            LocalUsageInfo localUsageInfo2 = this.f261965F;
            C87412m.m108591d(localUsageInfo2);
            String str2 = localUsageInfo2.f239040d;
            C87412m.m108593f(str2, "itemInfo!!.username");
            String quote = Pattern.quote("@app");
            C87412m.m108593f(quote, "quote(ConstantsStorage.TAG_APPBRAND)");
            str = C112551y.m153817q(str2, quote, "", false);
        }
        textView.setText(str);
    }
}
