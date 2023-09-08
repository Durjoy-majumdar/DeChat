package nq0;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.outerwidget.AppBrandOuterWidget;
import java.util.List;
import mq0.C88828e;
import mq0.C88830g;

/* renamed from: nq0.b */
public class C89050b implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a */
    public Context f256701a;

    public C89050b(Context context, Intent intent) {
        this.f256701a = context;
    }

    public int getCount() {
        List<C88828e> list = C88830g.f256241c.f256242a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public RemoteViews getLoadingView() {
        return new RemoteViews(this.f256701a.getPackageName(), C0966R.C0971layout.cu_);
    }

    public RemoteViews getViewAt(int i) {
        C88830g gVar = C88830g.f256241c;
        List<C88828e> list = gVar.f256242a;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        C88828e eVar = gVar.f256242a.get(i);
        RemoteViews remoteViews = new RemoteViews(this.f256701a.getPackageName(), C0966R.C0971layout.cu_);
        remoteViews.setTextViewText(C0966R.C0970id.n5_, eVar.f256238f);
        remoteViews.setImageViewBitmap(C0966R.C0970id.n59, gVar.f256243b[i]);
        Intent intent = new Intent();
        intent.putExtra("extra_item", eVar.f256233a);
        intent.putExtra("extra_action", "action_click_item");
        remoteViews.setOnClickFillInIntent(C0966R.C0970id.n59, intent);
        remoteViews.setOnClickFillInIntent(C0966R.C0970id.n5_, intent);
        Intent intent2 = new Intent();
        intent2.putExtra("extra_action", "action_click_bg");
        remoteViews.setOnClickFillInIntent(C0966R.C0970id.n58, intent2);
        return remoteViews;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void onCreate() {
    }

    public void onDataSetChanged() {
        AppBrandOuterWidget.m102761b();
    }

    public void onDestroy() {
        C88830g gVar = C88830g.f256241c;
        if (gVar.f256242a != null) {
            gVar.f256242a = null;
        }
    }
}
