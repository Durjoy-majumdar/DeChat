package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p248ug.C111161j0;
import te3.C64803wi0;

/* renamed from: com.tencent.mm.plugin.finder.ui.z2 */
public final class C56447z2 implements C111161j0 {

    /* renamed from: a */
    public final /* synthetic */ FinderSelectCoverUI f161343a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f161344b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f161345c;

    /* renamed from: d */
    public final /* synthetic */ int f161346d;

    /* renamed from: e */
    public final /* synthetic */ int f161347e;

    /* renamed from: f */
    public final /* synthetic */ long f161348f;

    /* renamed from: g */
    public final /* synthetic */ Canvas f161349g;

    public C56447z2(FinderSelectCoverUI finderSelectCoverUI, Bitmap bitmap, Bitmap bitmap2, int i, int i2, long j, Canvas canvas) {
        this.f161343a = finderSelectCoverUI;
        this.f161344b = bitmap;
        this.f161345c = bitmap2;
        this.f161346d = i;
        this.f161347e = i2;
        this.f161348f = j;
        this.f161349g = canvas;
    }

    /* renamed from: a */
    public void mo79184a(Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            if (!z) {
                Rect rect = new Rect(0, 0, this.f161346d, this.f161347e);
                if (bitmap.getHeight() < this.f161347e) {
                    int height = (this.f161346d - bitmap.getHeight()) / 2;
                    rect.top = height;
                    rect.bottom = height + bitmap.getHeight();
                }
                int width = bitmap.getWidth();
                int i = this.f161346d;
                if (width < i) {
                    int width2 = (i - bitmap.getWidth()) / 2;
                    rect.left = width2;
                    rect.right = width2 + bitmap.getWidth();
                }
                this.f161349g.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
            }
            FinderSelectCoverUI finderSelectCoverUI = this.f161343a;
            Bitmap bitmap2 = this.f161344b;
            Bitmap bitmap3 = this.f161345c;
            C87412m.m108593f(bitmap3, "bitmap");
            finderSelectCoverUI.mo79102R7(bitmap2, bitmap3, this.f161346d, this.f161347e, this.f161348f, this.f161343a.f161099L);
        }
    }

    /* renamed from: b */
    public void mo79185b(Exception exc) {
        Log.m105920e("Finder.FinderSelectCoverUI", "gen title error");
        FinderSelectCoverUI finderSelectCoverUI = this.f161343a;
        Bitmap bitmap = this.f161344b;
        Bitmap bitmap2 = this.f161345c;
        C87412m.m108593f(bitmap2, "bitmap");
        int i = this.f161346d;
        int i2 = this.f161347e;
        long j = this.f161348f;
        int i3 = FinderSelectCoverUI.f161087x0;
        finderSelectCoverUI.mo79102R7(bitmap, bitmap2, i, i2, j, (C64803wi0) null);
    }
}
