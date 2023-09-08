package cz2;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.convert.dowhat.DoWhatItemGroupConvert$buildItemConverts$1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import qz2.C47915e;

/* renamed from: cz2.o */
public final class C45238o extends C60896i<C47915e> {

    /* renamed from: e */
    public final C45239a f122581e;

    /* renamed from: cz2.o$a */
    public static final class C45239a implements C45241s {

        /* renamed from: a */
        public final /* synthetic */ C45241s f122582a;

        public C45239a(C45241s sVar) {
            this.f122582a = sVar;
        }

        /* renamed from: a */
        public void mo70748a(View view, String str) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(str, "iconId");
            Log.m105924i("MicroMsg.TextStatus.DoWhatItemGroupConvert", "onItemClick: iconId:" + str);
            this.f122582a.mo70748a(view, str);
        }
    }

    public C45238o(C45241s sVar) {
        C87412m.m108594g(sVar, "mOnItemClickListener");
        this.f122581e = new C45239a(sVar);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d3b;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C47915e eVar = (C47915e) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(eVar, "item");
        ((TextView) oVar.mo85812D(C0966R.C0970id.kyn)).setText(eVar.f128571d);
        Context context = oVar.f173499A;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        WindowManager windowManager = activity.getWindowManager();
        Resources resources = activity.getResources();
        RecyclerView recyclerView = (RecyclerView) oVar.mo85812D(C0966R.C0970id.npb);
        float min = ((float) Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight())) - resources.getDimension(C0966R.dimen.ax4);
        float dimension = resources.getDimension(C0966R.dimen.ax5);
        float dimension2 = resources.getDimension(C0966R.dimen.f357018ax3);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(activity, (int) ((min + dimension2) / (dimension + dimension2)));
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(new WxRecyclerAdapter(new DoWhatItemGroupConvert$buildItemConverts$1(this), eVar.f128572e, false));
        }
        ((ViewGroup) oVar.mo85812D(C0966R.C0970id.iwq)).setBackground(oVar.f173499A.getDrawable(C0966R.C0969drawable.f357388cm0));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
