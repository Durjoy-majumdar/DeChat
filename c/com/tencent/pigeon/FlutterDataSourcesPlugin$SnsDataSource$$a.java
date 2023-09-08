package com.tencent.pigeon;

import com.tencent.pigeon.FlutterDataSourcesPlugin;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterDataSourcesPlugin$SnsDataSource$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterDataSourcesPlugin.SnsDataSource f74835a;

    public /* synthetic */ FlutterDataSourcesPlugin$SnsDataSource$$a(FlutterDataSourcesPlugin.SnsDataSource snsDataSource) {
        this.f74835a = snsDataSource;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterDataSourcesPlugin.SnsDataSource.lambda$setup$0(this.f74835a, obj, reply);
    }
}
