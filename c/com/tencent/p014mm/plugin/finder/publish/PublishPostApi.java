package com.tencent.p014mm.plugin.finder.publish;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Set;
import je1.C33557l0;
import kotlin.Metadata;
import ob0.C89132b;
import p182kk.C61104a;
import p707tz.C65000f;
import qo1.C63292h;
import rx3.C13598b0;
import te3.C51860wo0;
import uq1.C65432d;
import uq1.C65433e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/publish/PublishPostApi;", "Lqo1/h;", "", "enableRecordTemplate", "Landroid/content/Context;", "context", "cameraCheck", "Lrx3/b0;", "clearMarkFiles", "", "md5", "Lob0/b;", "Lte3/wo0;", "getMiaojianCgi", "", "delay", "getMiaojianCgiWithLoading", "<init>", "()V", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.publish.PublishPostApi */
public final class PublishPostApi implements C63292h {
    public static final PublishPostApi INSTANCE = new PublishPostApi();

    private PublishPostApi() {
    }

    public boolean cameraCheck(Context context) {
        C87412m.m108594g(context, "context");
        int i = C65432d.f188291a;
        if (!C61104a.m71651g(context) && !C61104a.m71669y(context) && !C61104a.m71665u(context) && !C61104a.m71647c(context, true)) {
            return true;
        }
        Log.m105924i("Finder.FinderPostChecker", "camera check false");
        return false;
    }

    public void clearMarkFiles() {
        C65433e eVar = C65433e.f188292a;
        synchronized (C65433e.f188293b) {
            long currentTicks = Util.currentTicks();
            MultiProcessMMKV singleDefault = MultiProcessMMKV.getSingleDefault();
            Set<String> stringSet = singleDefault.getStringSet("MARK_DEL_FILES", new HashSet());
            if (stringSet != null) {
                for (String str : stringSet) {
                    Log.m105924i("finder.FinderPostFileManager", "FinderFileTrack clearMarkFiles " + str);
                    C86013q1.m106447h(str);
                }
            }
            singleDefault.putStringSet("MARK_DEL_FILES", new HashSet());
            long ticksToNow = Util.ticksToNow(currentTicks);
            if (stringSet != null && stringSet.size() > 0) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(1267, 5, 1);
                nVar.mo175913w(1267, 6, ticksToNow);
                Log.m105918d("Finder.FinderStat", "reportNormalFolderClearCost " + 1267 + ", key:5,6, costTime:" + ticksToNow);
            }
            Log.m105924i("finder.FinderPostFileManager", "clearMarkFolder cost:" + ticksToNow);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public boolean enableRecordTemplate() {
        return ((C65000f) C86312j.m106911c(C65000f.class)).mo89170Fk();
    }

    public C89132b<C51860wo0> getMiaojianCgi(String str) {
        C87412m.m108594g(str, "md5");
        return new C33557l0(str);
    }

    public C89132b<C51860wo0> getMiaojianCgiWithLoading(String str, Context context, long j) {
        C87412m.m108594g(str, "md5");
        C87412m.m108594g(context, "context");
        C33557l0 l0Var = new C33557l0(str);
        l0Var.mo85582k(context, context.getResources().getString(C0966R.string.ett), j);
        return l0Var;
    }
}
