package com.tencent.skyline;

import android.content.Context;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import p172io.flutter.embedding.engine.loader.FlutterLoader;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 6, 0})
public final class SkylineLogic$init$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ FlutterLoader $loader;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkylineLogic$init$1(FlutterLoader flutterLoader, Context context) {
        super(0);
        this.$loader = flutterLoader;
        this.$context = context;
    }

    public final void invoke() {
        if (!this.$loader.initialized()) {
            this.$loader.startInitialization(this.$context.getApplicationContext());
            this.$loader.ensureInitializationComplete(this.$context, (String[]) null);
        }
    }
}
