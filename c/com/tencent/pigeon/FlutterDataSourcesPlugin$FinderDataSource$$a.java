package com.tencent.pigeon;

import com.tencent.pigeon.FlutterDataSourcesPlugin;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterDataSourcesPlugin$FinderDataSource$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterDataSourcesPlugin.FinderDataSource f74833a;

    public /* synthetic */ FlutterDataSourcesPlugin$FinderDataSource$$a(FlutterDataSourcesPlugin.FinderDataSource finderDataSource) {
        this.f74833a = finderDataSource;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterDataSourcesPlugin.FinderDataSource.lambda$setup$0(this.f74833a, obj, reply);
    }
}
