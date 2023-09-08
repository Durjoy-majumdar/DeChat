package com.tencent.pigeon;

import com.tencent.pigeon.FlutterDataSourcesPlugin;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterDataSourcesPlugin$SnsDataSource$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterDataSourcesPlugin.SnsDataSource f74836a;

    public /* synthetic */ FlutterDataSourcesPlugin$SnsDataSource$$b(FlutterDataSourcesPlugin.SnsDataSource snsDataSource) {
        this.f74836a = snsDataSource;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterDataSourcesPlugin.SnsDataSource.lambda$setup$1(this.f74836a, obj, reply);
    }
}
