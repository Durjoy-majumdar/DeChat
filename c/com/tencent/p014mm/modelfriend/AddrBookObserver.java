package com.tencent.p014mm.modelfriend;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.service.MMService;
import f40.C86709a0;
import hg0.C76186t;
import java.util.HashSet;
import java.util.Random;
import ke3.C88144b;
import mg0.C76755c;
import sf0.C13658a;

/* renamed from: com.tencent.mm.modelfriend.AddrBookObserver */
public class AddrBookObserver extends ContentObserver {

    /* renamed from: b */
    public static Intent f237924b;

    /* renamed from: c */
    public static MMHandler f237925c = new C80998a(Looper.getMainLooper());

    /* renamed from: a */
    public final Context f237926a;

    /* renamed from: com.tencent.mm.modelfriend.AddrBookObserver$AddrBookService */
    public static class AddrBookService extends MMService {
        /* renamed from: b */
        public String mo63928b() {
            return "MicroMsg.AddrBookObserver";
        }

        /* renamed from: c */
        public IBinder mo93614c(Intent intent) {
            return null;
        }

        /* renamed from: g */
        public int mo93615g(Intent intent, int i, int i2) {
            super.mo93615g(intent, i, i2);
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(intent == null);
            Log.m105925i("MicroMsg.AddrBookObserver", "service start intent:%b", objArr);
            if (intent == null) {
                Log.m105920e("MicroMsg.AddrBookObserver", "intent == null, stop service");
                stopSelf();
                return 2;
            }
            float floatExtra = intent.getFloatExtra("key_sync_session", -1.0f);
            if (floatExtra == -1.0f) {
                Log.m105920e("MicroMsg.AddrBookObserver", "onStartCommand session == -1, stop service");
                stopSelf();
                return 2;
            }
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
            float f = sharedPreferences.getFloat("key_sync_session", 0.0f);
            if (f == floatExtra) {
                Log.m105919d("MicroMsg.AddrBookObserver", "onStartCommand session the same : %f", Float.valueOf(f));
                stopSelf();
                return 2;
            }
            sharedPreferences.edit().putFloat("key_sync_session", floatExtra).commit();
            Log.m105919d("MicroMsg.AddrBookObserver", "onStartCommand new session:%f", Float.valueOf(floatExtra));
            try {
                if (!C86709a0.m107522a()) {
                    Log.m105924i("MicroMsg.AddrBookObserver", "account not ready, stop sync");
                    stopSelf();
                    return 2;
                } else if (!C76186t.m91533a() || C76186t.m91539g()) {
                    Log.m105920e("MicroMsg.AddrBookObserver", "can not sync addr book now, stop service");
                    stopSelf();
                    return 2;
                } else {
                    Log.m105924i("MicroMsg.AddrBookObserver", "mark addr book had update.");
                    HashSet<C76755c> hashSet = C13658a.f38695a;
                    MultiProcessMMKV.getDefault().putInt("ADDRBOOK_HAD_UPDATE_KEY", 2).apply();
                    stopSelf();
                    return 2;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AddrBookObserver", e, "", new Object[0]);
                Log.m105921e("MicroMsg.AddrBookObserver", "AddrBookService onStart [%s]", e.getMessage());
                stopSelf();
            }
        }
    }

    /* renamed from: com.tencent.mm.modelfriend.AddrBookObserver$a */
    public class C80998a extends MMHandler {
        public C80998a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            Context context = (Context) message.obj;
            if (AddrBookObserver.f237924b == null) {
                Intent intent = new Intent();
                AddrBookObserver.f237924b = intent;
                intent.setClass(context, AddrBookService.class);
            }
            float nextFloat = new Random(System.currentTimeMillis()).nextFloat();
            AddrBookObserver.f237924b.putExtra("key_sync_session", nextFloat);
            try {
                Log.m105925i("MicroMsg.AddrBookObserver", "time's up, start AddrBookObserver, session:%f", Float.valueOf(nextFloat));
                C88144b.m109807y(AddrBookObserver.f237924b);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AddrBookObserver", e, "startService failed", new Object[0]);
            }
        }
    }

    public AddrBookObserver(Context context) {
        super(MMHandler.createFreeHandler(Looper.myLooper()));
        this.f237926a = context;
    }

    public void onChange(boolean z) {
        super.onChange(z);
        Log.m105924i("MicroMsg.AddrBookObserver", "address book changed, start sync after 20 second");
        f237925c.removeMessages(0);
        Message obtainMessage = f237925c.obtainMessage();
        obtainMessage.obj = this.f237926a;
        obtainMessage.what = 0;
        f237925c.sendMessageDelayed(obtainMessage, 10000);
    }
}
