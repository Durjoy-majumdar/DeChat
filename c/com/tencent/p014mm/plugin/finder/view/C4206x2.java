package com.tencent.p014mm.plugin.finder.view;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import o40.C61926c;
import r60.C101350i;
import t60.C64207e;
import x60.C102564a;

/* renamed from: com.tencent.mm.plugin.finder.view.x2 */
public final class C4206x2<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ WeImageView f18501a;

    /* renamed from: b */
    public final /* synthetic */ int f18502b;

    /* renamed from: c */
    public final /* synthetic */ String f18503c;

    public C4206x2(WeImageView weImageView, int i, String str) {
        this.f18501a = weImageView;
        this.f18502b = i;
        this.f18503c = str;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        C61926c.m72668M(new C4199w2((Bitmap) obj, this.f18501a, this.f18502b, this.f18503c));
    }
}
