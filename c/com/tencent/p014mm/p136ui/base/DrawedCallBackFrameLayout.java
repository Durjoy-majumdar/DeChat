package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;
import com.tencent.p014mm.plugin.report.service.C85405m;
import qw1.C101316l;

/* renamed from: com.tencent.mm.ui.base.DrawedCallBackFrameLayout */
public class DrawedCallBackFrameLayout extends FrameLayout {

    /* renamed from: d */
    public C96994a f284206d;

    /* renamed from: com.tencent.mm.ui.base.DrawedCallBackFrameLayout$a */
    public interface C96994a {
    }

    public DrawedCallBackFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable unused) {
        }
        C96994a aVar = this.f284206d;
        if (aVar != null) {
            AlbumPreviewUI.C93993h hVar = (AlbumPreviewUI.C93993h) aVar;
            hVar.getClass();
            String[] strArr = C101316l.f296815a;
            C85405m.m105412b(19);
            AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
            if (albumPreviewUI.f271258P) {
                albumPreviewUI.f271258P = false;
            }
            this.f284206d = null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setListener(C96994a aVar) {
        this.f284206d = aVar;
    }
}
