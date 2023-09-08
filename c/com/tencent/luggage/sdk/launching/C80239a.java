package com.tencent.luggage.sdk.launching;

import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* renamed from: com.tencent.luggage.sdk.launching.a */
public final class C80239a<R extends Parcelable> extends C80242c<R> {

    /* renamed from: b */
    public final int f234917b;

    /* renamed from: c */
    public final String f234918c;

    /* renamed from: d */
    public final AtomicBoolean f234919d = new AtomicBoolean(false);

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "R", "Landroid/os/Parcelable;", "message", "Lcom/tencent/luggage/sdk/launching/OnWXAppResultXPCMessage;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.luggage.sdk.launching.a$a */
    public static final class C80240a<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C80240a<InputType, ResultType> f234920a = new C80240a<>();

        public Object invoke(Object obj) {
            OnWXAppResultXPCMessage onWXAppResultXPCMessage = (OnWXAppResultXPCMessage) obj;
            if (onWXAppResultXPCMessage == null) {
                try {
                    return IPCVoid.f10316d;
                } catch (Exception unused) {
                }
            } else {
                OnWXAppResultLocalEvent onWXAppResultLocalEvent = new OnWXAppResultLocalEvent();
                onWXAppResultLocalEvent.f234909d = onWXAppResultXPCMessage.f78581d;
                onWXAppResultLocalEvent.f234910e = onWXAppResultXPCMessage.f78582e;
                onWXAppResultLocalEvent.f234911f = onWXAppResultXPCMessage.f78583f;
                onWXAppResultLocalEvent.publish();
                return IPCVoid.f10316d;
            }
        }
    }

    public C80239a(int i, String str) {
        this.f234917b = i;
        this.f234918c = str;
    }

    /* renamed from: a */
    public void mo111345a(R r) {
        mo111346b(new OnWXAppResultXPCMessage(this.f234917b, 1, r, (String) null, (String) null, 24, (C8480h) null));
    }

    /* renamed from: b */
    public final void mo111346b(OnWXAppResultXPCMessage onWXAppResultXPCMessage) {
        String str = this.f234918c;
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.OnWXAppResultEventSender", "sendMessage, processName empty, message:" + onWXAppResultXPCMessage.f78582e);
        } else if (!MMApplicationContext.isProcessExist(this.f234918c)) {
            Log.m105920e("MicroMsg.OnWXAppResultEventSender", "sendMessage, process dead, message:" + onWXAppResultXPCMessage.f78582e);
        } else {
            C28947a.m38501b(this.f234918c, onWXAppResultXPCMessage, C80240a.f234920a);
        }
    }
}
