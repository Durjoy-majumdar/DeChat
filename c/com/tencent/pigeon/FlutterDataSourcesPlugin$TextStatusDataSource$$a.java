package com.tencent.pigeon;

import com.tencent.pigeon.FlutterDataSourcesPlugin;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterDataSourcesPlugin$TextStatusDataSource$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterDataSourcesPlugin.TextStatusDataSource f74837a;

    public /* synthetic */ FlutterDataSourcesPlugin$TextStatusDataSource$$a(FlutterDataSourcesPlugin.TextStatusDataSource textStatusDataSource) {
        this.f74837a = textStatusDataSource;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterDataSourcesPlugin.TextStatusDataSource.lambda$setup$0(this.f74837a, obj, reply);
    }
}
