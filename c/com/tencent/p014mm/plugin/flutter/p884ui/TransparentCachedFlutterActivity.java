package com.tencent.p014mm.plugin.flutter.p884ui;

import android.os.Bundle;
import kotlin.Metadata;
import nj3.C88989a;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/flutter/ui/TransparentCachedFlutterActivity;", "Lcom/tencent/mm/plugin/flutter/ui/CachedFlutterActivity;", "<init>", "()V", "plugin-flutter_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.flutter.ui.TransparentCachedFlutterActivity */
public final class TransparentCachedFlutterActivity extends CachedFlutterActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f313159f = 0;

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().setStatusBarColor(0);
    }
}
