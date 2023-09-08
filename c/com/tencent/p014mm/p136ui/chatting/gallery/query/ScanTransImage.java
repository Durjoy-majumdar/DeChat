package com.tencent.p014mm.p136ui.chatting.gallery.query;

import android.app.Activity;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.gallery.query.ScanTransImage */
public final class ScanTransImage {

    /* renamed from: a */
    public int f284955a;

    /* renamed from: b */
    public Activity f284956b;

    /* renamed from: c */
    public C72963f4 f284957c;

    /* renamed from: d */
    public String f284958d = "";

    /* renamed from: e */
    public C92836k f284959e;

    /* renamed from: f */
    public final IListener<ScanTranslationResultEvent> f284960f = new ScanTransImage$scanTranslationResultEventListener$1(this, C40008f.f107254d);
}
