package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.plugin.game.model.C42072l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.tencent.mm.plugin.game.model.k */
public class C42069k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C42072l.C42074b f113348d;

    public C42069k(C42072l.C42074b bVar) {
        this.f113348d = bVar;
    }

    public void run() {
        C42072l.C42074b bVar = this.f113348d;
        if (bVar != null && !Util.isNullOrNil(bVar.f113364a) && !Util.isNullOrNil(bVar.f113365b)) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(bVar.f113365b).openConnection();
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setRequestMethod(bVar.f113364a.toUpperCase());
                httpURLConnection.setUseCaches(false);
                Log.m105925i("MicroMsg.GameControlCmdParser", "requestNet, method:%s, url:%s, responseCode:%d", bVar.f113364a, bVar.f113365b, Integer.valueOf(httpURLConnection.getResponseCode()));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.GameControlCmdParser", e, "", new Object[0]);
            }
        }
    }
}
