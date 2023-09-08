package com.tencent.p014mm.plugin.appbrand.game.preload;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppPreDownloadStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.game.preload.f */
public class C81891f {

    /* renamed from: j */
    public static volatile C81891f f240209j;

    /* renamed from: a */
    public String f240210a;

    /* renamed from: b */
    public int f240211b;

    /* renamed from: c */
    public int f240212c;

    /* renamed from: d */
    public int f240213d;

    /* renamed from: e */
    public String f240214e;

    /* renamed from: f */
    public int f240215f;

    /* renamed from: g */
    public int f240216g = -1;

    /* renamed from: h */
    public boolean f240217h = false;

    /* renamed from: i */
    public int f240218i;

    /* renamed from: a */
    public static C81891f m100578a() {
        if (f240209j == null) {
            synchronized (C81891f.class) {
                if (f240209j == null) {
                    f240209j = new C81891f();
                }
            }
        }
        return f240209j;
    }

    /* renamed from: b */
    public void mo114291b(int i, int i2) {
        if (!Util.isNullOrNil(this.f240214e) && !Util.isNullOrNil(this.f240210a)) {
            Log.m105927v("MicroMsg.WAGamePreloadStatisManager", "instanceId:%s,appId:%s,appVersion:%d,appState:%d,appType:%d,key:%d,value:%d,scene:%d,misDownloadedCode:%d", this.f240214e, this.f240210a, Integer.valueOf(this.f240211b), Integer.valueOf(this.f240212c), Integer.valueOf(this.f240213d), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f240216g), Integer.valueOf(this.f240217h ? 1 : 0));
            WeAppPreDownloadStruct weAppPreDownloadStruct = new WeAppPreDownloadStruct();
            weAppPreDownloadStruct.f236631d = weAppPreDownloadStruct.mo86045b("SessionId", this.f240214e, true);
            weAppPreDownloadStruct.f236632e = weAppPreDownloadStruct.mo86045b("AppId", this.f240210a, true);
            weAppPreDownloadStruct.f236633f = (long) this.f240211b;
            int i3 = this.f240212c;
            WeAppPreDownloadStruct.C80756b bVar = null;
            weAppPreDownloadStruct.f236634g = i3 != 1 ? i3 != 2 ? i3 != 3 ? null : WeAppPreDownloadStruct.C80755a.test : WeAppPreDownloadStruct.C80755a.debug : WeAppPreDownloadStruct.C80755a.release;
            int i4 = this.f240213d;
            if (i4 != 0) {
                switch (i4) {
                    case 1000:
                        bVar = WeAppPreDownloadStruct.C80756b.normal;
                        break;
                    case 1001:
                        bVar = WeAppPreDownloadStruct.C80756b.plugin;
                        break;
                    case 1002:
                        bVar = WeAppPreDownloadStruct.C80756b.wxstore;
                        break;
                    case 1003:
                        bVar = WeAppPreDownloadStruct.C80756b.merchant;
                        break;
                    case 1004:
                        bVar = WeAppPreDownloadStruct.C80756b.wagame;
                        break;
                    case 1005:
                        bVar = WeAppPreDownloadStruct.C80756b.gift;
                        break;
                }
            } else {
                bVar = WeAppPreDownloadStruct.C80756b.undefined;
            }
            weAppPreDownloadStruct.f236635h = bVar;
            weAppPreDownloadStruct.f236636i = (long) this.f240215f;
            weAppPreDownloadStruct.f236637j = (long) i;
            weAppPreDownloadStruct.f236638k = (long) i2;
            weAppPreDownloadStruct.f236639l = this.f240217h ? 1 : 0;
            weAppPreDownloadStruct.f236640m = (long) this.f240216g;
            weAppPreDownloadStruct.f236641n = (long) this.f240218i;
            weAppPreDownloadStruct.mo86054n();
        }
    }
}
