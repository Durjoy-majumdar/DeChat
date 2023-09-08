package com.tencent.p014mm.service;

import android.content.Intent;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import mu3.C109639a;

/* renamed from: com.tencent.mm.service.MMIntentService */
public abstract class MMIntentService extends MMService {

    /* renamed from: i */
    public volatile C85773a f249810i;

    /* renamed from: com.tencent.mm.service.MMIntentService$a */
    public final class C85773a extends MMHandler {
        public C85773a(C109639a aVar) {
            super(aVar);
        }

        public void handleMessage(Message message) {
            MMIntentService.this.mo63929j((Intent) message.obj);
            MMIntentService mMIntentService = MMIntentService.this;
            int i = message.arg1;
            Log.m105925i(mMIntentService.mo63928b(), "%s stopSelf() startId = %d mStartId = %d", "MicroMsg.MMService", Integer.valueOf(i), Integer.valueOf(mMIntentService.f249812d));
            if (i == mMIntentService.f249812d) {
                mMIntentService.mo119618a(new Intent(), "stop");
            }
        }
    }

    public MMIntentService(String str) {
    }

    /* renamed from: d */
    public void mo112546d() {
        super.mo112546d();
        this.f249810i = new C85773a(C109639a.m148950a("close-db-while-crash"));
    }

    /* renamed from: e */
    public void mo112547e() {
        this.f249810i.getSerial().f328238b.mo182313f();
    }

    /* renamed from: f */
    public void mo112549f(Intent intent, int i) {
        Message obtainMessage = this.f249810i.obtainMessage();
        obtainMessage.arg1 = i;
        obtainMessage.obj = intent;
        this.f249810i.sendMessage(obtainMessage);
    }

    /* renamed from: g */
    public int mo93615g(Intent intent, int i, int i2) {
        mo112549f(intent, i2);
        return 2;
    }

    /* renamed from: j */
    public abstract void mo63929j(Intent intent);
}
