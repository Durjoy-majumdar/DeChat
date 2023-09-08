package com.tencent.p014mm.plugin.flutter.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import hu1.C117113a;
import hu1.C87595b;
import hu1.C87596c;
import hu1.C87597d;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import tf0.C118487h1;
import tf0.C22540j1;
import tf0.C64910f1;
import tf0.C90453g1;
import tu1.C118534l;

/* renamed from: com.tencent.mm.plugin.flutter.model.ChannelRegistrant */
public class ChannelRegistrant {
    public static void registerWith(FlutterEngine flutterEngine) {
        if (flutterEngine.getPlugins().has(C87595b.class)) {
            Log.m105928w("ChannelRegistrant", "already registered");
            return;
        }
        Log.m105918d("ChannelRegistrant", "registerWith FlutterEngine");
        flutterEngine.getPlugins().add((FlutterPlugin) new C87595b());
        flutterEngine.getPlugins().add((FlutterPlugin) new C87596c());
        flutterEngine.getPlugins().add((FlutterPlugin) new C87597d());
        flutterEngine.getPlugins().add((FlutterPlugin) new C118534l());
        flutterEngine.getPlugins().add((FlutterPlugin) new C90453g1());
        flutterEngine.getPlugins().add((FlutterPlugin) new C118487h1());
        flutterEngine.getPlugins().add((FlutterPlugin) new C22540j1());
        flutterEngine.getPlugins().add((FlutterPlugin) new C64910f1());
        flutterEngine.addDataReportListener(new C117113a(flutterEngine));
    }
}
