package com.tencent.p014mm.opensdk.diffdev.p315a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.p014mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p014mm.opensdk.diffdev.OAuthListener;
import com.tencent.p014mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.a */
public class C17823a implements IDiffDevOAuth {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Handler f49093a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<OAuthListener> f49094b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C17826b f49095c;

    /* renamed from: d */
    private OAuthListener f49096d = new C17824a();

    /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a */
    public class C17824a implements OAuthListener {

        /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a$a */
        public class C17825a implements Runnable {
            public C17825a() {
            }

            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C17823a.this.f49094b);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OAuthListener) it.next()).onQrcodeScanned();
                }
            }
        }

        public C17824a() {
        }

        public void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
            Log.m99043d("MicroMsg.SDK.ListenerWrapper", String.format("onAuthFinish, errCode = %s, authCode = %s", new Object[]{oAuthErrCode.toString(), str}));
            C17826b unused = C17823a.this.f49095c = null;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C17823a.this.f49094b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthFinish(oAuthErrCode, str);
            }
        }

        public void onAuthGotQrcode(String str, byte[] bArr) {
            Log.m99043d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = " + str);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C17823a.this.f49094b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthGotQrcode(str, bArr);
            }
        }

        public void onQrcodeScanned() {
            Log.m99043d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
            if (C17823a.this.f49093a != null) {
                C17823a.this.f49093a.post(new C17825a());
            }
        }
    }

    public void addListener(OAuthListener oAuthListener) {
        if (!this.f49094b.contains(oAuthListener)) {
            this.f49094b.add(oAuthListener);
        }
    }

    public boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        String str6 = str;
        OAuthListener oAuthListener2 = oAuthListener;
        Log.m99045i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = " + str);
        if (str6 == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            Log.m99043d("MicroMsg.SDK.DiffDevOAuth", String.format("auth fail, invalid argument, appId = %s, scope = %s", new Object[]{str6, str2}));
            return false;
        }
        if (this.f49093a == null) {
            this.f49093a = new Handler(Looper.getMainLooper());
        }
        if (!this.f49094b.contains(oAuthListener2)) {
            this.f49094b.add(oAuthListener2);
        }
        if (this.f49095c != null) {
            Log.m99043d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
            return true;
        }
        C17826b bVar = new C17826b(str, str2, str3, str4, str5, this.f49096d);
        this.f49095c = bVar;
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    public void detach() {
        Log.m99045i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f49094b.clear();
        stopAuth();
    }

    public void removeAllListeners() {
        this.f49094b.clear();
    }

    public void removeListener(OAuthListener oAuthListener) {
        this.f49094b.remove(oAuthListener);
    }

    public boolean stopAuth() {
        boolean z;
        Log.m99045i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            C17826b bVar = this.f49095c;
            z = bVar == null ? true : bVar.mo22000a();
        } catch (Exception e) {
            Log.m99047w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e.getMessage());
            z = false;
        }
        this.f49095c = null;
        return z;
    }
}
