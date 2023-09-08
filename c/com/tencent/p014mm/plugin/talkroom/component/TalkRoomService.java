package com.tencent.p014mm.plugin.talkroom.component;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.talkroom.component.TalkRoomService */
public class TalkRoomService extends Service {

    /* renamed from: d */
    public C115795f f249141d;

    static {
        Log.m105924i("MicroMsg.TalkRoomService", "" + Thread.currentThread().getId());
    }

    public IBinder onBind(Intent intent) {
        Log.m105918d("MicroMsg.TalkRoomService", "onBind~~~ threadID:" + Thread.currentThread());
        return this.f249141d;
    }

    public void onCreate() {
        Log.m105918d("MicroMsg.TalkRoomService", "onCreate~~~threadID:" + Thread.currentThread());
        super.onCreate();
        if (this.f249141d == null) {
            this.f249141d = new C115795f();
        }
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.TalkRoomService", "onDestroy~~~ threadID:" + Thread.currentThread());
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        Log.m105918d("MicroMsg.TalkRoomService", "onRebind~~~ threadID:" + Thread.currentThread());
        super.onRebind(intent);
    }

    public boolean onUnbind(Intent intent) {
        Log.m105918d("MicroMsg.TalkRoomService", "onUnbind~~~ threadID:" + Thread.currentThread());
        return super.onUnbind(intent);
    }
}
