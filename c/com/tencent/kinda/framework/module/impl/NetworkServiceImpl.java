package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.KCgi;
import com.tencent.kinda.gen.KNetworkMockManager;
import com.tencent.kinda.gen.KNetworkService;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C81039e;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.io.IOException;
import ob0.C89137b0;
import p156gj.C87200o;
import p156gj.C87203t;
import pe3.C89349b;
import qe3.C89625d;
import te3.C90417ia;

public class NetworkServiceImpl implements KNetworkService {
    private static final String TAG = "MicroMsg.WXPNetworkServiceImpl";

    private byte[] getBaseRequestOnError(int i) {
        try {
            byte[] bArr = {0, 1};
            C90417ia iaVar = new C90417ia();
            iaVar.f259573g = 0;
            iaVar.f259572f = new C89349b(bArr, 0, 2);
            iaVar.f259574h = new C89349b(bArr, 0, 2);
            iaVar.f259575i = i;
            iaVar.f259570d = new C89349b(bArr, 0, 2);
            iaVar.f259571e = C86709a0.m107523b().mo121110g();
            return iaVar.toByteArray();
        } catch (IOException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return new byte[0];
        }
    }

    public byte[] getBaseRequest(int i) {
        C90417ia iaVar = new C90417ia();
        byte[] baseRequestOnError = getBaseRequestOnError(i);
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        if (b0Var == null) {
            Log.printErrStackTrace(TAG, new Throwable(), "kernel().network().getNetSceneQueue() return null!!", new Object[0]);
            return baseRequestOnError;
        }
        C114770g gVar = b0Var.f256809d;
        if (gVar == null) {
            Log.printErrStackTrace(TAG, new Throwable(), "netSceneQueue.getDispatcher() return null!!", new Object[0]);
            return baseRequestOnError;
        }
        C81039e A3 = gVar.mo55443A3();
        if (A3 == null) {
            Log.printErrStackTrace(TAG, new Throwable(), "dispatcher.getAccInfo() return null!!", new Object[0]);
            return baseRequestOnError;
        }
        iaVar.f259573g = C89625d.f257841g;
        iaVar.f259575i = i;
        iaVar.f259571e = A3.getUin();
        Log.m105927v(TAG, "uin: %d, uin2: %d, username: %s, wxusername: %s, islogin: %s", Integer.valueOf(C86709a0.m107523b().mo121110g()), Integer.valueOf(A3.getUin()), A3.getUsername(), A3.mo55413B(), Boolean.valueOf(A3.mo55417G3()));
        C89349b a = C89349b.m111674a(C87203t.m108273i().getBytes());
        iaVar.f259572f = a;
        if (a.f257327a.length >= 16) {
            a.mo123701d(16);
            iaVar.f259572f = a;
        }
        C89349b a2 = C89349b.m111674a(C87200o.f252868a.getBytes());
        iaVar.f259574h = a2;
        if (a2.f257327a.length >= 132) {
            a2.mo123701d(132);
            iaVar.f259574h = a2;
        }
        try {
            String str = new String("\u0000");
            C89349b bVar = new C89349b();
            bVar.f257327a = str.getBytes("UTF-8");
            iaVar.f259570d = bVar;
        } catch (Exception e) {
            Log.m105920e(TAG, e.getLocalizedMessage());
        }
        try {
            byte[] byteArray = iaVar.toByteArray();
            Log.m105927v(TAG, "result.size: %d", Integer.valueOf(byteArray.length));
            return byteArray;
        } catch (IOException e2) {
            Log.printErrStackTrace(TAG, e2, "", new Object[0]);
            Log.m105927v(TAG, "exception: %s", e2.getMessage());
            return baseRequestOnError;
        }
    }

    public void invoke(KCgi kCgi, KNetworkMockManager kNetworkMockManager) {
        Log.m105919d(TAG, "thread when WXPNetworkServiceImpl.invoke: %s, , thread id: %d", Thread.currentThread(), Long.valueOf(Thread.currentThread().getId()));
        C86709a0.m107529k().f251779b.mo123460f(new WXPNetSceneBase(kCgi.getCgiId(), kCgi.getCgiId(), kCgi.getCgiUrl(), kCgi.getChannelType(), kCgi.getTimeout(), kCgi.getRetryCount(), kCgi.getRequestData(), kCgi, kNetworkMockManager));
        Log.m105919d(TAG, "do scene for: %s", kCgi.getCgiUrl());
    }
}
