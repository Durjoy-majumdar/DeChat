package com.tencent.pigeon;

import com.tencent.pigeon.FlutterDataSourcesPlugin;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterDataSourcesPlugin$FinderDataSource$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterDataSourcesPlugin.FinderDataSource f74834a;

    public /* synthetic */ FlutterDataSourcesPlugin$FinderDataSource$$b(FlutterDataSourcesPlugin.FinderDataSource finderDataSource) {
        this.f74834a = finderDataSource;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterDataSourcesPlugin.FinderDataSource.lambda$setup$1(this.f74834a, obj, reply);
    }
}
