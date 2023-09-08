package com.tencent.p014mm.plugin.emoji.model;

import android.content.Context;
import android.content.Intent;
import c00.C0405n;
import c00.C0406o;
import com.tencent.p014mm.autogen.events.FlutterMethodCallEvent;
import com.tencent.p014mm.plugin.emoji.model.FlutterEmotionLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.emoji.model.z */
public class C93122z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlutterMethodCallEvent f268267d;

    public C93122z(FlutterEmotionLogic.C556181 r1, FlutterMethodCallEvent flutterMethodCallEvent) {
        this.f268267d = flutterMethodCallEvent;
    }

    public void run() {
        Class cls = C0405n.class;
        boolean yv02 = ((C0406o) C86312j.m106911c(C0406o.class)).yv0(24, 384);
        int intValue = ((Integer) this.f268267d.f264872d.f264874b.mo136893a(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)).intValue();
        Intent O20 = ((C0405n) C86312j.m106911c(cls)).O20();
        ((C0405n) C86312j.m106911c(cls)).mo281hr(O20, 24, false, 384);
        O20.putExtra("ftsneedkeyboard", !yv02);
        O20.putExtra("key_load_js_without_delay", true);
        O20.putExtra("ftsInitToSearch", true);
        this.f268267d.f264872d.getClass();
        C88144b.m109805w((Context) null, O20);
        C115669n.INSTANCE.mo160131h(13054, Integer.valueOf(intValue), 0, "");
    }
}
