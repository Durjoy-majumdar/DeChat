package la3;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import ma3.C34533d;
import qa3.C101087a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: la3.e */
public class C34209e extends C86301e implements C34533d {

    /* renamed from: d */
    public final C101087a[] f92251d = {null};

    public void onAccountInitialized(Context context) {
        Log.m105926v("PluginWelab", "onAccountInitialized");
    }

    public void onAccountReleased(Context context) {
        Log.m105926v("PluginWelab", "onAccountRelease");
    }

    public void onCreate(Context context) {
        Log.m105926v("PluginWelab", "configure");
    }
}
