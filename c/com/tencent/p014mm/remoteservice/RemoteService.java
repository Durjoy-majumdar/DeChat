package com.tencent.p014mm.remoteservice;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.tencent.p014mm.remoteservice.C96902c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.reflect.Constructor;

/* renamed from: com.tencent.mm.remoteservice.RemoteService */
public class RemoteService extends Service {

    /* renamed from: d */
    public C96902c.C96903a f283894d = new C96896a();

    /* renamed from: com.tencent.mm.remoteservice.RemoteService$a */
    public class C96896a extends C96902c.C96903a {
        public C96896a() {
        }

        /* renamed from: DY */
        public void mo135246DY(String str, String str2, Bundle bundle, C96899b bVar) {
            C96897a aVar;
            try {
                Class<?> loadClass = RemoteService.this.getClassLoader().loadClass(str);
                Constructor[] constructors = loadClass.getConstructors();
                if (constructors.length > 0) {
                    Object[] objArr = new Object[constructors[0].getParameterTypes().length];
                    objArr[0] = null;
                    aVar = (C96897a) constructors[0].newInstance(objArr);
                } else {
                    aVar = (C96897a) loadClass.newInstance();
                }
                aVar.f283897e = bVar;
                aVar.onCallback(str2, bundle, false);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.RemoveService", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }

    public IBinder onBind(Intent intent) {
        Thread.currentThread().getId();
        return this.f283894d;
    }

    public void onDestroy() {
        Thread.currentThread().getId();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        Thread.currentThread().getId();
        super.onRebind(intent);
    }

    public boolean onUnbind(Intent intent) {
        Thread.currentThread().getId();
        return super.onUnbind(intent);
    }
}
