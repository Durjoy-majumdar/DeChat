package com.tencent.p014mm.p136ui;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ReStartLauncherUIEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C88989a;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.EmptyActivity */
public class EmptyActivity extends MMActivity {
    public int getLayoutId() {
        return C0966R.C0971layout.a3e;
    }

    public void onCreate(Bundle bundle) {
        Log.m105919d("MicroMsg.EmptyActivity", "onCreate %s", Integer.valueOf(hashCode()));
        requestWindowFeature(1);
        super.onCreate(bundle);
        updataStatusBarIcon(C85875k4.m106211z());
        overridePendingTransition(0, 0);
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.a7_));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105919d("MicroMsg.EmptyActivity", "onDestroy %s", Integer.valueOf(hashCode()));
    }

    public void onPause() {
        super.onPause();
        Log.m105919d("MicroMsg.EmptyActivity", "onPause %s", Integer.valueOf(hashCode()));
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.EmptyActivity", "onResume %s", Integer.valueOf(hashCode()));
        new ReStartLauncherUIEvent().asyncPublish(Looper.getMainLooper());
    }
}
