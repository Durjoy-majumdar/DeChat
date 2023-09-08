package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Context;
import android.content.Intent;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32228q;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$l0 */
public class ImageGalleryUI$$l0 implements C32228q<Context, String, Integer, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ int f284520d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284521e;

    public ImageGalleryUI$$l0(ImageGalleryUI imageGalleryUI, int i) {
        this.f284521e = imageGalleryUI;
        this.f284520d = i;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        Class cls = C45696d.class;
        return Boolean.valueOf(((C45696d) C86709a0.m107533q(cls)).mo70957E5(260) && ((C45696d) C86709a0.m107533q(cls)).Ms0(this.f284521e, (String) obj2, ((Integer) obj3).intValue(), true, 260, this.f284520d, new Intent()));
    }
}
