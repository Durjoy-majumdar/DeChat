package com.tencent.pigeon;

import com.tencent.pigeon.FlutterDataSourcesPlugin;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterDataSourcesPlugin$TextStatusDataSource$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterDataSourcesPlugin.TextStatusDataSource f74838a;

    public /* synthetic */ FlutterDataSourcesPlugin$TextStatusDataSource$$b(FlutterDataSourcesPlugin.TextStatusDataSource textStatusDataSource) {
        this.f74838a = textStatusDataSource;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterDataSourcesPlugin.TextStatusDataSource.lambda$setup$1(this.f74838a, obj, reply);
    }
}
