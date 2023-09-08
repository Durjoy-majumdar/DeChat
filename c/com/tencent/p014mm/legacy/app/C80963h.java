package com.tencent.p014mm.legacy.app;

import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import mp3.C88816a;
import mp3.C88819d;
import mp3.C88825i;
import nr3.C89057c;

/* renamed from: com.tencent.mm.legacy.app.h */
public class C80963h {

    /* renamed from: d */
    public static C80963h f237818d;

    /* renamed from: a */
    public HandlerThread f237819a;

    /* renamed from: b */
    public MMHandler f237820b = new MMHandler(this.f237819a.getLooper());

    /* renamed from: c */
    public C88819d f237821c;

    public C80963h(String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, i);
        this.f237819a = handlerThread;
        handlerThread.start();
        this.f237821c = new C88825i((C88816a) new C89057c(this.f237820b), str);
    }
}
