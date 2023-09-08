package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.d0 */
public class C105522d0 {

    /* renamed from: a */
    public MTimerHandler f313909a = null;

    /* renamed from: b */
    public float f313910b;

    /* renamed from: c */
    public float f313911c;

    /* renamed from: d */
    public float f313912d;

    /* renamed from: e */
    public long f313913e;

    /* renamed from: f */
    public float f313914f;

    /* renamed from: g */
    public int f313915g;

    /* renamed from: h */
    public boolean f313916h;

    /* renamed from: i */
    public C105523a f313917i;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.d0$a */
    public interface C105523a {
    }

    public C105522d0(float f, float f2, int i) {
        this.f313911c = f;
        this.f313912d = f2;
        this.f313915g = i;
        this.f313910b = (100.0f / ((float) i)) * 20.0f;
        Log.m105925i("MicroMsg.ProgressHandlerAnimator", "create ProgressHandlerAnimator, start: %s, end: %s, duration: %s, updateStep: %s", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Float.valueOf(this.f313910b));
        this.f313916h = false;
        this.f313913e = 0;
        this.f313909a = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C105520c0(this), true);
    }
}
