package com.tencent.p014mm.memory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.InputStream;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.memory.l */
public abstract class C92712l {

    /* renamed from: a */
    public static C92710j f266815a = new C92710j();

    /* renamed from: b */
    public static C92713m f266816b = new C92713m();

    /* renamed from: c */
    public static int f266817c = -1;

    /* renamed from: a */
    public static boolean m116839a() {
        boolean c = C11171e.m11046c(19);
        Log.m105925i("MicroMsg.PlatformBitmapFactory", "canUseInBitmapFactory, isVersionMatch: %b, isART: %b, result: %s", Boolean.valueOf(c), Boolean.valueOf(Util.isART()), Boolean.valueOf(c));
        return c;
    }

    /* renamed from: c */
    public static C92712l m116840c() {
        if (f266817c == -1) {
            if (m116839a()) {
                f266817c = 1;
            } else {
                f266817c = 2;
            }
        }
        int i = f266817c;
        return i != 1 ? i != 2 ? f266816b : f266816b : f266815a;
    }

    /* renamed from: b */
    public abstract Bitmap mo126911b(String str, BitmapFactory.Options options);

    /* renamed from: d */
    public abstract void mo126912d(Bitmap bitmap);

    /* renamed from: e */
    public abstract Bitmap mo126913e(String str, Rect rect, BitmapFactory.Options options);

    /* renamed from: f */
    public void mo126917f(InputStream inputStream) {
        try {
            inputStream.reset();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.PlatformBitmapFactory", e, "reset stream error: %s", e.getMessage());
        }
    }
}
