package com.tencent.p014mm.plugin.wear.model.service;

import a70.C112760b;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.WearableListenerService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import k73.C33843a;
import l71.C117461a;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.wear.model.service.WearDataLayerService */
public class WearDataLayerService extends WearableListenerService {
    /* renamed from: a */
    public final Bundle mo176385a(byte[] bArr) {
        Bundle bundle = new Bundle();
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        int readInt = dataInputStream.readInt();
        bundle.putInt("key_connecttype", readInt);
        int readInt2 = dataInputStream.readInt();
        bundle.putInt("key_sessionid", readInt2);
        int readInt3 = dataInputStream.readInt();
        bundle.putInt("key_funid", readInt3);
        int readInt4 = dataInputStream.readInt();
        if (readInt4 > 0 && readInt4 < bArr.length) {
            byte[] bArr2 = new byte[readInt4];
            dataInputStream.readFully(bArr2);
            bundle.putByteArray("key_data", bArr2);
        } else if (readInt4 >= bArr.length) {
            throw new IOException("contentLength too large " + readInt4);
        }
        Log.m105925i("MicroMsg.Wear.WearDataLayerService", "receive data connectType=%d sessionId=%d funId=%d contentLength=%d", Integer.valueOf(readInt), Integer.valueOf(readInt2), Integer.valueOf(readInt3), Integer.valueOf(readInt4));
        return bundle;
    }

    public void onChannelClosed(Channel channel, int i, int i2) {
        Log.m105925i("MicroMsg.Wear.WearDataLayerService", "onChannelClosed %s %s %d %d", channel.getPath(), channel.getNodeId(), Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void onChannelOpened(Channel channel) {
        String path = channel.getPath();
        String nodeId = channel.getNodeId();
        File file = new File(C112760b.m154239k(), C90193h.m112878f(path.getBytes()));
        Log.m105925i("MicroMsg.Wear.WearDataLayerService", "onChannelOpened %s %s %s", path, nodeId, file.getAbsolutePath());
        if (file.exists()) {
            file.delete();
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.Wear.WearDataLayerService", e, "onChannelOpened", new Object[0]);
        }
        try {
            GoogleApiClient build = new GoogleApiClient.Builder(MMApplicationContext.getContext()).addApi(Wearable.API).build();
            if (!build.isConnected()) {
                Log.m105924i("MicroMsg.Wear.GlobalConnection", "connect to google api client");
                ConnectionResult blockingConnect = build.blockingConnect(30, TimeUnit.SECONDS);
                if (!blockingConnect.isSuccess()) {
                    Log.m105921e("MicroMsg.Wear.GlobalConnection", "google api client connect error, code=%d, ", Integer.valueOf(blockingConnect.getErrorCode()));
                }
            }
            channel.receiveFile(build, Uri.fromFile(file), false);
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.Wear.WearDataLayerService", e2, "fuck Xiao Mi", new Object[0]);
        }
    }

    public void onCreate() {
        super.onCreate();
        Log.m105924i("MicroMsg.Wear.WearDataLayerService", "onCreate");
        C117461a.m165683c(C117461a.C117463b.WEAR_SERVICE_CREATE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDataChanged(com.google.android.gms.wearable.DataEventBuffer r17) {
        /*
            r16 = this;
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r2 = r17.getCount()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            com.google.android.gms.common.api.Status r2 = r17.getStatus()
            r4 = 1
            r0[r4] = r2
            java.lang.String r2 = "MicroMsg.Wear.WearDataLayerService"
            java.lang.String r5 = "onDataChanged %d %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r0)
            java.util.Iterator r5 = r17.iterator()
        L_0x0020:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0150
            java.lang.Object r0 = r5.next()
            com.google.android.gms.wearable.DataEvent r0 = (com.google.android.gms.wearable.DataEvent) r0
            int r6 = r0.getType()
            if (r6 != r4) goto L_0x014c
            com.google.android.gms.wearable.DataItem r6 = r0.getDataItem()
            android.net.Uri r6 = r6.getUri()
            java.lang.String r7 = r6.getPath()
            java.lang.String r8 = "/"
            java.lang.String[] r7 = r7.split(r8)     // Catch:{ Exception -> 0x004e }
            r7 = r7[r1]     // Catch:{ Exception -> 0x004e }
            java.lang.String r8 = "wear"
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x004e }
            goto L_0x004f
        L_0x004e:
            r7 = 0
        L_0x004f:
            if (r7 == 0) goto L_0x014c
            com.google.android.gms.wearable.DataItem r0 = r0.getDataItem()
            com.google.android.gms.wearable.DataMapItem r0 = com.google.android.gms.wearable.DataMapItem.fromDataItem(r0)
            com.google.android.gms.wearable.DataMap r0 = r0.getDataMap()
            java.lang.String r7 = "key_data"
            com.google.android.gms.wearable.Asset r0 = r0.getAsset(r7)
            java.lang.String r7 = "google api client connect error, code=%d, "
            r8 = 30
            java.lang.String r10 = "connect to google api client"
            java.lang.String r11 = "MicroMsg.Wear.GlobalConnection"
            if (r0 == 0) goto L_0x0103
            com.google.android.gms.common.api.GoogleApiClient$Builder r12 = new com.google.android.gms.common.api.GoogleApiClient$Builder
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12.<init>(r13)
            com.google.android.gms.common.api.Api<com.google.android.gms.wearable.Wearable$WearableOptions> r13 = com.google.android.gms.wearable.Wearable.API
            com.google.android.gms.common.api.GoogleApiClient$Builder r12 = r12.addApi(r13)
            com.google.android.gms.common.api.GoogleApiClient r12 = r12.build()
            com.google.android.gms.wearable.DataApi r13 = com.google.android.gms.wearable.Wearable.DataApi
            boolean r14 = r12.isConnected()
            if (r14 != 0) goto L_0x00a6
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            com.google.android.gms.common.ConnectionResult r14 = r12.blockingConnect(r8, r14)
            boolean r15 = r14.isSuccess()
            if (r15 != 0) goto L_0x00a6
            java.lang.Object[] r15 = new java.lang.Object[r4]
            int r14 = r14.getErrorCode()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15[r3] = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r7, r15)
        L_0x00a6:
            com.google.android.gms.common.api.PendingResult r0 = r13.getFdForAsset((com.google.android.gms.common.api.GoogleApiClient) r12, (com.google.android.gms.wearable.Asset) r0)
            com.google.android.gms.common.api.Result r0 = r0.await()
            com.google.android.gms.wearable.DataApi$GetFdForAssetResult r0 = (com.google.android.gms.wearable.DataApi.GetFdForAssetResult) r0
            com.google.android.gms.common.api.Status r12 = r0.getStatus()
            boolean r13 = r12.isSuccess()
            if (r13 != 0) goto L_0x00d3
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r13 = r12.getStatusCode()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0[r3] = r13
            java.lang.String r12 = r12.getStatusMessage()
            r0[r4] = r12
            java.lang.String r12 = "read asset data not success errorCode=%d | errorMsg=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r12, r0)
            r0 = 0
            goto L_0x00db
        L_0x00d3:
            java.io.InputStream r0 = r0.getInputStream()
            byte[] r0 = p823sg.C48377f.m53723b(r0)
        L_0x00db:
            if (r0 != 0) goto L_0x00de
            return
        L_0x00de:
            java.lang.String r12 = "receive data = %d"
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00f8 }
            int r14 = r0.length     // Catch:{ IOException -> 0x00f8 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ IOException -> 0x00f8 }
            r13[r3] = r14     // Catch:{ IOException -> 0x00f8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r13)     // Catch:{ IOException -> 0x00f8 }
            r12 = r16
            android.os.Bundle r0 = r12.mo176385a(r0)     // Catch:{ IOException -> 0x00f6 }
            k73.C33843a.m40158a(r0)     // Catch:{ IOException -> 0x00f6 }
            goto L_0x0105
        L_0x00f6:
            r0 = move-exception
            goto L_0x00fb
        L_0x00f8:
            r0 = move-exception
            r12 = r16
        L_0x00fb:
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.String r14 = "decode data error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r14, r13)
            goto L_0x0105
        L_0x0103:
            r12 = r16
        L_0x0105:
            com.google.android.gms.common.api.GoogleApiClient$Builder r0 = new com.google.android.gms.common.api.GoogleApiClient$Builder
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.<init>(r13)
            com.google.android.gms.common.api.Api<com.google.android.gms.wearable.Wearable$WearableOptions> r13 = com.google.android.gms.wearable.Wearable.API
            com.google.android.gms.common.api.GoogleApiClient$Builder r0 = r0.addApi(r13)
            com.google.android.gms.common.api.GoogleApiClient r0 = r0.build()
            com.google.android.gms.wearable.DataApi r13 = com.google.android.gms.wearable.Wearable.DataApi
            boolean r14 = r0.isConnected()
            if (r14 != 0) goto L_0x013e
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            com.google.android.gms.common.ConnectionResult r8 = r0.blockingConnect(r8, r10)
            boolean r9 = r8.isSuccess()
            if (r9 != 0) goto L_0x013e
            java.lang.Object[] r9 = new java.lang.Object[r4]
            int r8 = r8.getErrorCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9[r3] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r7, r9)
        L_0x013e:
            r13.deleteDataItems(r0, r6)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r6
            java.lang.String r6 = "delete data item %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r0)
            goto L_0x0020
        L_0x014c:
            r12 = r16
            goto L_0x0020
        L_0x0150:
            r12 = r16
            r17.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wear.model.service.WearDataLayerService.onDataChanged(com.google.android.gms.wearable.DataEventBuffer):void");
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.Wear.WearDataLayerService", "onDestroy");
        super.onDestroy();
        C117461a.m165683c(C117461a.C117463b.WEAR_SERVICE_DESTROY);
    }

    public void onInputClosed(Channel channel, int i, int i2) {
        int i3;
        String path = channel.getPath();
        Log.m105925i("MicroMsg.Wear.WearDataLayerService", "onInputClosed %s %s %d %d", path, channel.getNodeId(), Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0) {
            File file = new File(C112760b.m154239k(), C90193h.m112878f(path.getBytes()));
            Log.m105925i("MicroMsg.Wear.WearDataLayerService", "onInputClosed %s, %d", file.getAbsolutePath(), Long.valueOf(file.length()));
            Bundle bundle = new Bundle();
            bundle.putInt("key_connecttype", 1);
            try {
                i3 = Integer.valueOf(path.split("/")[4]).intValue();
            } catch (Exception unused) {
                i3 = 0;
            }
            bundle.putInt("key_funid", i3);
            bundle.putInt("key_sessionid", 0);
            bundle.putByteArray("key_data", file.getAbsolutePath().getBytes());
            C33843a.m40158a(bundle);
        }
    }

    public void onMessageReceived(MessageEvent messageEvent) {
        boolean z;
        Log.m105925i("MicroMsg.Wear.WearDataLayerService", "onMessageReceived %s", messageEvent.getPath());
        try {
            z = messageEvent.getPath().split("/")[2].equals(PutDataRequest.WEAR_URI_SCHEME);
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            try {
                byte[] data = messageEvent.getData();
                Log.m105925i("MicroMsg.Wear.WearDataLayerService", "receive data = %d", Integer.valueOf(data.length));
                C33843a.m40158a(mo176385a(data));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Wear.WearDataLayerService", e, "decode message error", new Object[0]);
            }
        }
    }

    public void onOutputClosed(Channel channel, int i, int i2) {
        Log.m105925i("MicroMsg.Wear.WearDataLayerService", "onOutputClosed %s %s %d %d", channel.getPath(), channel.getNodeId(), Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void onPeerConnected(Node node) {
        Log.m105925i("MicroMsg.Wear.WearDataLayerService", "onPeerConnected %s", node.getId());
        Bundle bundle = new Bundle();
        bundle.putInt("key_connecttype", 3);
        bundle.putInt("key_funid", 1);
        bundle.putByteArray("key_data", node.getId().getBytes());
        C33843a.m40158a(bundle);
    }

    public void onPeerDisconnected(Node node) {
        Log.m105925i("MicroMsg.Wear.WearDataLayerService", "onPeerDisconnected %s", node.getId());
        Bundle bundle = new Bundle();
        bundle.putInt("key_connecttype", 3);
        bundle.putInt("key_funid", -1);
        bundle.putByteArray("key_data", node.getId().getBytes());
        C33843a.m40158a(bundle);
    }
}
