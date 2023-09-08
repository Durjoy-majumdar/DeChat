package com.tencent.p014mm.plugin.vlog.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;

/* renamed from: com.tencent.mm.plugin.vlog.model.FinderVideoShell */
public final class FinderVideoShell {

    /* renamed from: a */
    public static final FinderVideoShell f82198a = new FinderVideoShell();

    /* renamed from: b */
    public static String f82199b = "";

    /* renamed from: c */
    public static String f82200c = "";

    /* renamed from: d */
    public static VideoTransPara f82201d;

    /* renamed from: e */
    public static int f82202e;

    /* renamed from: f */
    public static long f82203f;

    /* renamed from: g */
    public static long f82204g;

    /* renamed from: h */
    public static long f82205h;

    /* renamed from: i */
    public static long f82206i;

    /* renamed from: j */
    public static long f82207j;

    /* renamed from: k */
    public static long f82208k;

    /* renamed from: l */
    public static long f82209l;

    /* renamed from: m */
    public static long f82210m;

    /* renamed from: n */
    public static long f82211n;

    /* renamed from: o */
    public static long f82212o;

    /* renamed from: p */
    public static long f82213p;

    /* renamed from: q */
    public static float f82214q;

    /* renamed from: r */
    public static int f82215r;

    /* renamed from: s */
    public static int f82216s;

    /* renamed from: t */
    public static final FinderVideoShell$listener$1 f82217t = new FinderVideoShell$listener$1(C40008f.f107254d);

    /* renamed from: a */
    public final boolean mo57453a() {
        if (WeChatEnvironment.hasDebugger() && f82201d != null) {
            if (f82199b.length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo57454b() {
        Log.m105924i("MicroMsg.FinderVideoShell", "reset");
        f82203f = 0;
        f82204g = 0;
        f82205h = 0;
        f82206i = 0;
        f82207j = 0;
        f82208k = 0;
        f82209l = 0;
    }
}
