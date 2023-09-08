package com.tencent.p014mm.p136ui;

/* renamed from: com.tencent.mm.ui.x3 */
public class C45109x3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f122377d;

    /* renamed from: e */
    public final /* synthetic */ C45110y3 f122378e;

    public C45109x3(C45110y3 y3Var, boolean z) {
        this.f122378e = y3Var;
        this.f122377d = z;
    }

    public void run() {
        this.f122378e.f122379a.f121203q.f29691a = Boolean.valueOf(this.f122377d);
        this.f122378e.f122379a.f121199j.edit().putBoolean("room_add_blacklist", this.f122377d).commit();
        this.f122378e.f122379a.f121193d.notifyDataSetChanged();
    }
}
