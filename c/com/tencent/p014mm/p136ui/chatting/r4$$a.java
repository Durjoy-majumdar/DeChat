package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.WWAPIFactory;
import com.tencent.wework.api.model.WWMediaMiniProgram;

/* renamed from: com.tencent.mm.ui.chatting.r4$$a */
public final /* synthetic */ class r4$$a implements r4$$h {

    /* renamed from: a */
    public final /* synthetic */ WWMediaMiniProgram f285155a;

    /* renamed from: b */
    public final /* synthetic */ String f285156b;

    /* renamed from: c */
    public final /* synthetic */ String f285157c;

    /* renamed from: d */
    public final /* synthetic */ int f285158d;

    /* renamed from: e */
    public final /* synthetic */ Context f285159e;

    /* renamed from: f */
    public final /* synthetic */ IWWAPI.WWAppType f285160f;

    public /* synthetic */ r4$$a(WWMediaMiniProgram wWMediaMiniProgram, String str, String str2, int i, Context context, IWWAPI.WWAppType wWAppType) {
        this.f285155a = wWMediaMiniProgram;
        this.f285156b = str;
        this.f285157c = str2;
        this.f285158d = i;
        this.f285159e = context;
        this.f285160f = wWAppType;
    }

    /* renamed from: a */
    public final void mo136092a(byte[] bArr) {
        WWMediaMiniProgram wWMediaMiniProgram = this.f285155a;
        String str = this.f285156b;
        String str2 = this.f285157c;
        int i = this.f285158d;
        Context context = this.f285159e;
        IWWAPI.WWAppType wWAppType = this.f285160f;
        if (bArr == null) {
            bArr = new byte[1];
        }
        wWMediaMiniProgram.f285823h = bArr;
        if (bArr.length > 1048576) {
            Log.m105924i("MicroMsg.SendToWeWorkHelper", "miniProgram.hdImageData.length > 1M");
            wWMediaMiniProgram.f285823h = new byte[1];
        }
        wWMediaMiniProgram.f285825j = str;
        wWMediaMiniProgram.f285818c = str2;
        wWMediaMiniProgram.f285826k = i;
        Log.m105919d("MicroMsg.SendToWeWorkHelper", "sendMiniProgramToWeWork WWMediaMiniProgram[username:%s path:%s iconUrl:%s hdImageData:%s name:%s title:%s]", wWMediaMiniProgram.f285821f, wWMediaMiniProgram.f285822g, wWMediaMiniProgram.f285824i, Integer.valueOf(wWMediaMiniProgram.f285823h.length), wWMediaMiniProgram.f285825j, wWMediaMiniProgram.f285818c);
        WWAPIFactory.m125312a(context).mo136603a(wWMediaMiniProgram, wWAppType);
    }
}
