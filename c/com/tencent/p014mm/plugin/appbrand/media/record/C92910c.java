package com.tencent.p014mm.plugin.appbrand.media.record;

import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import p375qh.C101180a;
import p375qh.C101182e;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.c */
public final class C92910c {

    /* renamed from: a */
    public static C101180a f267599a;

    /* renamed from: b */
    public static String f267600b;

    /* renamed from: c */
    public static C83623a f267601c;

    /* renamed from: d */
    public static MTimerHandler f267602d;

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.c$a */
    public interface C83623a {
    }

    /* renamed from: a */
    public static void m117223a(int i) {
        Log.m105925i("MicroMsg.Record.AudioRecorder", "stopRecord what:%d", Integer.valueOf(i));
        if (!Util.isNullOrNil(f267600b)) {
            C101180a aVar = f267599a;
            if (aVar == null) {
                Log.m105924i("MicroMsg.Record.AudioRecorder", "sRecorder is null,err");
                return;
            }
            ((C101182e) aVar).mo140633h();
            ((C101182e) f267599a).mo140629d();
            f267599a = null;
            MTimerHandler mTimerHandler = f267602d;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            f267602d = null;
            f267600b = null;
            C83623a aVar2 = f267601c;
            if (aVar2 != null) {
                ((JsApiStartRecordVoice.StartRecordVoice.C82062a.C82063a) aVar2).mo114520a(i);
            }
            f267601c = null;
        }
    }
}
