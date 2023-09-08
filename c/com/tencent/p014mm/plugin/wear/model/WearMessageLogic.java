package com.tencent.p014mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.util.GmsVersion;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.JsApiGetAdPushMsg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.qqpinyin.voicerecoapi.C116361c;
import di3.C86312j;
import eb0.C97625j3;
import j73.C117299a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import m73.C46951c;
import n73.C47187a;
import n73.C47188b;
import n73.C47192i;
import n73.C47201q;
import n73.C47202r;
import o73.C47336d;
import p827uh.C52575d;
import te3.v15;
import tw0.C90583b;
import tw0.C90584e;

/* renamed from: com.tencent.mm.plugin.wear.model.WearMessageLogic */
public class WearMessageLogic extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f117454a = WeChatPermissions.PERMISSION_WEAR_MESSAGE();

    /* renamed from: com.tencent.mm.plugin.wear.model.WearMessageLogic$b */
    public class C43454b extends C47336d {

        /* renamed from: d */
        public int f117455d;

        /* renamed from: e */
        public int f117456e;

        /* renamed from: f */
        public int f117457f;

        /* renamed from: g */
        public byte[] f117458g;

        public C43454b(WearMessageLogic wearMessageLogic, C43453a aVar) {
        }

        /* renamed from: a */
        public void mo67620a() {
            Log.m105925i("MicroMsg.Wear.WearMessageLogic", "handle message %s", toString());
            C43457b.vx0().requireAccountInitialized();
            C47188b bVar = C43457b.vx0().f117462d.f126760a.get(Integer.valueOf(this.f117456e));
            if (bVar != null) {
                int i = this.f117455d;
                int i2 = this.f117457f;
                int i3 = this.f117456e;
                byte[] bArr = this.f117458g;
                if (!bVar.mo72262c(i3) || bArr == null || (bArr = C43457b.xx0().mo176380a(bArr)) != null) {
                    byte[] b = bVar.mo11244b(i3, bArr);
                    if (!(bVar instanceof C47192i)) {
                        if (bVar.mo72263d(i3)) {
                            b = C43457b.xx0().mo176381b(b);
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        try {
                            dataOutputStream.writeInt(i);
                            dataOutputStream.writeInt(i2);
                            dataOutputStream.writeInt(i3);
                            if (b == null || b.length <= 0) {
                                dataOutputStream.writeInt(0);
                            } else {
                                dataOutputStream.writeInt(b.length);
                                dataOutputStream.write(b);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            Log.m105925i("MicroMsg.Wear.BaseHttpServer", "send data funId=%d length=%d", Integer.valueOf(i3), Integer.valueOf(byteArray.length));
                            if (!bVar.mo72264e(i3)) {
                                C43457b.xx0().mo176384e(byteArray);
                            } else {
                                ThreadPool.post(new C47187a(bVar, byteArray), "WearSendResponseTask");
                            }
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.Wear.BaseHttpServer", e, "gen response data error connectType=%d, sessionId=%d, funId=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                        }
                    }
                } else {
                    Log.m105920e("MicroMsg.Wear.BaseHttpServer", "request data decrypt error");
                }
            }
        }

        /* renamed from: b */
        public String mo67621b() {
            return "HttpMessageTask";
        }

        public String toString() {
            return String.format("connectType=%d funId=%d sessionId=%d", new Object[]{Integer.valueOf(this.f117455d), Integer.valueOf(this.f117456e), Integer.valueOf(this.f117457f)});
        }
    }

    /* renamed from: com.tencent.mm.plugin.wear.model.WearMessageLogic$c */
    public class C43455c extends C47336d {

        /* renamed from: d */
        public int f117459d;

        /* renamed from: e */
        public int f117460e;

        /* renamed from: f */
        public byte[] f117461f;

        public C43455c(WearMessageLogic wearMessageLogic, C43453a aVar) {
        }

        /* renamed from: a */
        public void mo67620a() {
            if (this.f117459d == 30001) {
                C47202r rVar = C43457b.xx0().f347579e;
                int i = this.f117460e;
                byte[] bArr = this.f117461f;
                if (!rVar.f126755n.contains(Integer.valueOf(i))) {
                    v15 v15 = new v15();
                    try {
                        v15.parseFrom(bArr);
                    } catch (IOException unused) {
                    }
                    if (rVar.f126753i != i) {
                        rVar.mo72267b();
                        rVar.f126753i = i;
                        Log.m105925i("MicroMsg.Wear.VoiceToTextServer", "startNewSession %s", Integer.valueOf(i));
                        String str = C47202r.f126747o;
                        C86013q1.m106447h(str);
                        if (rVar.f126750f == null) {
                            C52575d dVar = new C52575d();
                            rVar.f126750f = dVar;
                            dVar.mo73537a(str);
                        }
                        if (rVar.f126749e == null) {
                            C116361c cVar = new C116361c(1500000, GmsVersion.VERSION_LONGHORN);
                            rVar.f126749e = cVar;
                            if (cVar.mo178019b() != 0) {
                                rVar.f126754j = -2;
                                return;
                            }
                        }
                        String str2 = v15.f143249d;
                        if (rVar.f126748d == null) {
                            MMHandlerThread.postToMainThread(new C47201q(rVar, str2));
                        }
                        rVar.mo72266a(i, v15);
                    } else if (v15.f143253h) {
                        Log.m105925i("MicroMsg.Wear.VoiceToTextServer", "cancel session %d", Integer.valueOf(i));
                        rVar.mo72267b();
                    } else if (v15.f143252g) {
                        rVar.mo72266a(i, v15);
                        C52575d dVar2 = rVar.f126750f;
                        if (dVar2 != null) {
                            dVar2.mo73541e();
                            rVar.f126750f = null;
                            Log.m105924i("MicroMsg.Wear.VoiceToTextServer", "finish speex compress");
                        }
                        C116361c cVar2 = rVar.f126749e;
                        if (cVar2 != null) {
                            cVar2.mo178020c();
                            rVar.f126749e = null;
                            Log.m105924i("MicroMsg.Wear.VoiceToTextServer", "finish voiceDetectAPI");
                        }
                        C46951c cVar3 = rVar.f126748d;
                        if (cVar3 != null) {
                            cVar3.f126243j = true;
                            if (!rVar.f126751g) {
                                C97625j3.m125815e().mo123460f(rVar.f126748d);
                            }
                            rVar.f126748d = null;
                            Log.m105924i("MicroMsg.Wear.VoiceToTextServer", "finish netSceneVoiceToText");
                        }
                    } else {
                        rVar.mo72266a(i, v15);
                    }
                }
            }
        }

        /* renamed from: b */
        public String mo67621b() {
            return "LongConnectTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.wear.model.WearMessageLogic$d */
    public class C43456d extends C47336d {
        public C43456d(WearMessageLogic wearMessageLogic, C43453a aVar) {
        }

        /* renamed from: a */
        public void mo67620a() {
            if (C43457b.xx0().mo176382c() != null) {
                C117299a aVar = (C117299a) C43457b.xx0().mo176382c();
                aVar.f351169a.disconnect();
                aVar.mo181969b();
            }
        }

        /* renamed from: b */
        public String mo67621b() {
            return "RefreshConnectTask";
        }
    }

    public WearMessageLogic() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.wear.message");
        MMApplicationContext.getContext().registerReceiver(this, intentFilter, f117454a, (Handler) null);
    }

    public void onReceive(Context context, Intent intent) {
        ((C90584e) C86312j.m106911c(C90584e.class)).bs0(C90583b.f260266j, JsApiGetAdPushMsg.CTRL_INDEX);
        if (intent.getAction().equals("com.tencent.mm.wear.message")) {
            Bundle extras = intent.getExtras();
            int i = extras.getInt("key_connecttype");
            if (i == 1) {
                C43454b bVar = new C43454b(this, (C43453a) null);
                bVar.f117455d = i;
                bVar.f117456e = extras.getInt("key_funid");
                bVar.f117457f = extras.getInt("key_sessionid");
                bVar.f117458g = extras.getByteArray("key_data");
                C43457b.vx0().requireAccountInitialized();
                C47188b bVar2 = C43457b.vx0().f117462d.f126760a.get(Integer.valueOf(bVar.f117456e));
                if (bVar2 != null ? bVar2.mo72264e(bVar.f117456e) : false) {
                    MMHandlerThread.postToMainThread(bVar);
                    return;
                }
                ThreadPool.post(bVar, "WearHttpMessageTask_" + bVar.f117456e);
            } else if (i == 2) {
                C43455c cVar = new C43455c(this, (C43453a) null);
                cVar.f117459d = extras.getInt("key_funid");
                cVar.f117460e = extras.getInt("key_sessionid");
                cVar.f117461f = extras.getByteArray("key_data");
                C43457b.Ax0().mo67630a(cVar);
            } else if (i == 3) {
                C43457b.Ax0().mo67630a(new C43456d(this, (C43453a) null));
            }
        }
    }
}
