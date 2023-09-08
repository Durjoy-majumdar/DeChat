package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C88990b;
import p156gj.C107824c0;
import p156gj.C107835h0;
import p605mj.C34575a;

/* renamed from: com.tencent.mm.ui.MMFragmentActivity$$c */
public class MMFragmentActivity$$c {

    /* renamed from: a */
    public static int f318644a;

    /* renamed from: b */
    public static int f318645b;

    /* renamed from: c */
    public static int f318646c;

    /* renamed from: d */
    public static int f318647d;

    /* renamed from: e */
    public static int f318648e;

    /* renamed from: f */
    public static int f318649f;

    /* renamed from: g */
    public static int f318650g;

    /* renamed from: h */
    public static int f318651h;

    static {
        boolean e = C88990b.m111196e() & C34575a.m40396a();
        int i = e ? C0966R.C0968anim.f2503er : C0966R.C0968anim.f2456di;
        f318644a = i;
        int i2 = C0966R.C0968anim.f2333y;
        int i3 = e ? C0966R.C0968anim.f2498em : C0966R.C0968anim.f2333y;
        f318645b = i3;
        if (e) {
            i2 = C0966R.C0968anim.f2496ek;
        }
        f318646c = i2;
        int i4 = e ? C0966R.C0968anim.f2506eu : C0966R.C0968anim.f2461dn;
        f318647d = i4;
        f318648e = i;
        f318649f = i3;
        f318650g = i2;
        f318651h = i4;
    }

    /* renamed from: a */
    public static void m143992a() {
        C107835h0.f322850g.getClass();
        boolean z = false;
        if (C107824c0.f322783c) {
            C107824c0.f322783c = false;
            z = true;
        }
        Log.m105924i("MicroMsg.MMFragmentActivity", "lm: setAnimationStyle swipbackType = " + z);
        if (z) {
            boolean e = C88990b.m111196e() & C34575a.m40396a();
            Log.m105924i("MicroMsg.MMFragmentActivity", "lm: setAnimationStyle supportSwipe = " + e);
            f318644a = e ? MMFragmentActivity.getSlideRightInAnim() : C0966R.C0968anim.f2456di;
            int i = C0966R.C0968anim.f2333y;
            f318645b = e ? MMFragmentActivity.getSlideLeftOutAnim() : C0966R.C0968anim.f2333y;
            if (e) {
                i = MMFragmentActivity.getSlideLeftInAnim();
            }
            f318646c = i;
            int access$300 = e ? MMFragmentActivity.getSlideRightOutAnim() : C0966R.C0968anim.f2461dn;
            f318647d = access$300;
            f318648e = f318644a;
            f318649f = f318645b;
            f318650g = f318646c;
            f318651h = access$300;
        }
    }
}
