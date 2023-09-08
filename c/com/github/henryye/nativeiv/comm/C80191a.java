package com.github.henryye.nativeiv.comm;

import android.graphics.Bitmap;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import p1024q6.C89483b;
import p1024q6.C89484c;

/* renamed from: com.github.henryye.nativeiv.comm.a */
public class C80191a implements C89483b<NativeBitmapStruct> {

    /* renamed from: a */
    public NativeImageJni f234739a;

    /* renamed from: b */
    public HashMap<Integer, NativeImage> f234740b = new HashMap<>();

    public C80191a() {
        NativeImageJni nativeImageJni = new NativeImageJni();
        this.f234739a = nativeImageJni;
        nativeImageJni.mo111040c();
    }

    /* renamed from: a */
    public boolean mo111042a(InputStream inputStream, Bitmap.Config config, C89484c cVar) {
        return cVar == C89484c.PNG || cVar == C89484c.JPG;
    }

    /* renamed from: b */
    public IBitmap<NativeBitmapStruct> mo111043b() {
        return new NativeImage(this.f234739a, this);
    }

    public void destroy() {
        this.f234739a.mo111039b();
        LinkedList linkedList = new LinkedList();
        synchronized (this) {
            for (NativeImage push : this.f234740b.values()) {
                linkedList.push(push);
            }
            this.f234740b.clear();
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((NativeImage) it.next()).recycle();
        }
        linkedList.clear();
    }
}
