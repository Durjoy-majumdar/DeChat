package com.tencent.p014mm.modelimage;

import android.graphics.Bitmap;
import o90.C100301b;
import p520fi.C32055i;
import p823sg.C101611g;

/* renamed from: com.tencent.mm.modelimage.y */
public final class C92857y implements C32055i {

    /* renamed from: d */
    public C101611g<String, Bitmap> f267468d = new C100301b(5, C92857y.class);

    public Object get(Object obj) {
        return ((C100301b) this.f267468d).get((String) obj);
    }

    public void put(Object obj, Object obj2) {
        ((C100301b) this.f267468d).mo139557c((String) obj, (Bitmap) obj2);
    }

    public Object remove(Object obj) {
        ((C100301b) this.f267468d).remove((String) obj);
        return null;
    }
}
