package com.tencent.p014mm.plugin.multitalk.model;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105598b;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.model.z */
public class C105856z implements C105598b<Integer> {

    /* renamed from: a */
    public final /* synthetic */ int f314833a;

    /* renamed from: b */
    public final /* synthetic */ String f314834b;

    /* renamed from: c */
    public final /* synthetic */ String f314835c;

    /* renamed from: d */
    public final /* synthetic */ MultiTalkManager f314836d;

    public C105856z(MultiTalkManager multiTalkManager, int i, String str, String str2) {
        this.f314836d = multiTalkManager;
        this.f314833a = i;
        this.f314834b = str;
        this.f314835c = str2;
    }

    /* renamed from: a */
    public void mo150477a(int i, int i2, String str, Object obj) {
        int i3;
        Integer num = (Integer) obj;
        int i4 = 2;
        if (i == 0 && i2 == 0) {
            i3 = num.intValue();
            if (!(i3 == 2 || i3 == 1)) {
                i3 = 1;
            }
            Log.m105925i("MicroMsg.MT.MultiTalkManager", "steve: getMTSDKMode done! svrmode:%d, finalmode:%d", Integer.valueOf(num.intValue()), Integer.valueOf(i3));
        } else {
            Log.m105921e("MicroMsg.MT.MultiTalkManager", "steve: getMTSDKMode fail errtype %d errcode %d errMsg: %s, finalmode:%d", Integer.valueOf(i), Integer.valueOf(i2), str, 1);
            i3 = 1;
        }
        int i5 = this.f314833a;
        if (i5 != 0) {
            if (i5 != 1) {
                i4 = 1;
            }
            i3 = i4;
        }
        this.f314836d.mo150654c(this.f314834b, this.f314835c, i3);
    }
}
