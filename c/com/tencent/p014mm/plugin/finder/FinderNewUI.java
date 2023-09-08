package com.tencent.p014mm.plugin.finder;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/FinderNewUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.FinderNewUI */
public final class FinderNewUI extends MMActivity {
    public void finish() {
        super.finish();
        Log.m105924i("Finder.MMFinderUI", "finish " + "FinderNewUI" + ", " + hashCode() + ",  " + getTaskId());
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("Finder.MMFinderUI", "onCreate " + "FinderNewUI" + ", " + hashCode() + ",  " + getTaskId());
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("Finder.MMFinderUI", "onDestroy " + "FinderNewUI" + ", " + hashCode() + ",  " + getTaskId());
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("Finder.MMFinderUI", "onPause " + "FinderNewUI" + ", " + hashCode() + ",  " + getTaskId());
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("Finder.MMFinderUI", "onResume " + "FinderNewUI" + ", " + hashCode() + ",  " + getTaskId());
    }
}
