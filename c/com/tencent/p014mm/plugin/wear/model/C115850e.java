package com.tencent.p014mm.plugin.wear.model;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Wearable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j73.C117299a;
import j73.C117300b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n73.C117613c;
import n73.C47193j;
import n73.C47194k;
import n73.C47202r;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.wear.model.e */
public class C115850e {

    /* renamed from: a */
    public C117300b f347575a = new C117299a();

    /* renamed from: b */
    public C117613c f347576b = new C117613c();

    /* renamed from: c */
    public C47193j f347577c = new C47193j();

    /* renamed from: d */
    public C47194k f347578d = new C47194k();

    /* renamed from: e */
    public C47202r f347579e = new C47202r();

    /* renamed from: a */
    public byte[] mo176380a(byte[] bArr) {
        byte[] f = this.f347576b.mo182332f();
        if (!(bArr == null || f == null)) {
            try {
                Log.m105919d("MicroMsg.Wear.WearConnectLogic", "sessionKey is not null %s", C90193h.m112878f(f));
                SecretKeySpec secretKeySpec = new SecretKeySpec(f, "AES");
                Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
                instance.init(2, secretKeySpec);
                return instance.doFinal(bArr);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Wear.WearConnectLogic", e, "", new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: b */
    public byte[] mo176381b(byte[] bArr) {
        byte[] f = this.f347576b.mo182332f();
        if (bArr == null || f == null) {
            return null;
        }
        try {
            Log.m105919d("MicroMsg.Wear.WearConnectLogic", "sessionKey is not null %s", C90193h.m112878f(f));
            SecretKeySpec secretKeySpec = new SecretKeySpec(f, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
            instance.init(1, secretKeySpec);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Wear.WearConnectLogic", e, "", new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j73.C117300b mo176382c() {
        /*
            r4 = this;
            j73.b r0 = r4.f347575a
            j73.a r0 = (j73.C117299a) r0
            r0.getClass()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            r2 = 1
            java.lang.String r3 = "com.google.android.wearable.app"
            r0.getPackageInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x0018 }
            r0 = 1
            goto L_0x001a
        L_0x0018:
            r0 = 0
        L_0x001a:
            if (r0 != 0) goto L_0x0032
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r3 = "com.google.android.wearable.app.cn"
            r0.getPackageInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x002b }
            r0 = 1
            goto L_0x002d
        L_0x002b:
            r0 = 0
        L_0x002d:
            if (r0 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r0 = 0
            goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            if (r0 == 0) goto L_0x0055
            j73.b r0 = r4.f347575a
            j73.a r0 = (j73.C117299a) r0
            com.google.android.gms.common.api.GoogleApiClient r3 = r0.mo181969b()
            boolean r3 = r3.isConnected()
            if (r3 != 0) goto L_0x0044
            goto L_0x0050
        L_0x0044:
            java.util.HashSet r0 = r0.mo181968a()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = 1
        L_0x0050:
            if (r1 == 0) goto L_0x0055
            j73.b r0 = r4.f347575a
            return r0
        L_0x0055:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wear.model.C115850e.mo176382c():j73.b");
    }

    /* renamed from: d */
    public boolean mo176383d() {
        return mo176382c() != null && ((C117299a) mo176382c()).mo181968a().size() > 0;
    }

    /* renamed from: e */
    public boolean mo176384e(byte[] bArr) {
        C117300b.C117301a aVar;
        C117300b.C117301a aVar2;
        byte[] bArr2 = bArr;
        if (bArr2 == null || !mo176383d()) {
            return false;
        }
        MMApplicationContext.getContext();
        String format = String.format("/wechat/%s/%d", new Object[]{"phone", Long.valueOf(System.currentTimeMillis())});
        C117300b c = mo176382c();
        if (c == null) {
            return false;
        }
        if (bArr2.length <= 92160) {
            C117299a aVar3 = (C117299a) c;
            HashSet<String> a = aVar3.mo181968a();
            C117300b.C117301a aVar4 = new C117300b.C117301a();
            Iterator<String> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = aVar4;
                    break;
                }
                String next = it.next();
                if (!aVar3.mo181969b().isConnected()) {
                    aVar2 = new C117300b.C117301a(131072);
                } else {
                    C117300b.C117301a aVar5 = new C117300b.C117301a();
                    Status status = Wearable.MessageApi.sendMessage(aVar3.mo181969b(), next, format, bArr2).await(2, TimeUnit.SECONDS).getStatus();
                    if (!status.isSuccess()) {
                        aVar5.f351170a = 131072;
                        status.getStatusMessage();
                        Log.m105921e("MicroMsg.Wear.GlobalConnection", "send message not success errorCode=%d | errorMsg=%s", Integer.valueOf(status.getStatusCode()), status.getStatusMessage());
                    }
                    Log.m105919d("MicroMsg.Wear.GlobalConnection", "send Message %s %s %d", next, format, Integer.valueOf(bArr2.length));
                    aVar2 = aVar5;
                }
                if (aVar2.f351170a != 0) {
                    aVar = aVar2;
                    break;
                }
            }
        } else {
            C117299a aVar6 = (C117299a) c;
            if (!aVar6.mo181969b().isConnected()) {
                aVar = new C117300b.C117301a(131072);
            } else {
                PutDataMapRequest create = PutDataMapRequest.create(format);
                create.getDataMap().putLong("key_timestamp", System.currentTimeMillis());
                create.getDataMap().putAsset("key_data", Asset.createFromBytes(bArr));
                PutDataRequest asPutDataRequest = create.asPutDataRequest();
                Wearable.DataApi.putDataItem(aVar6.mo181969b(), asPutDataRequest);
                Log.m105919d("MicroMsg.Wear.GlobalConnection", "send data request path=%s | length=%d", asPutDataRequest.getUri().getPath(), Integer.valueOf(asPutDataRequest.getData().length));
                aVar = new C117300b.C117301a();
            }
        }
        return aVar.f351170a == 0;
    }
}
