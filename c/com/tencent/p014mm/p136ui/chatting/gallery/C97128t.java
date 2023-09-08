package com.tencent.p014mm.p136ui.chatting.gallery;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import java.util.HashMap;
import java.util.LinkedList;
import o90.C100301b;
import p823sg.C101611g;

/* renamed from: com.tencent.mm.ui.chatting.gallery.t */
public class C97128t {

    /* renamed from: a */
    public C101611g<String, Bitmap> f284989a = new C100301b(4, new C97129a(), C97128t.class);

    /* renamed from: b */
    public HashMap<String, Long> f284990b = new HashMap<>();

    /* renamed from: c */
    public LinkedList<String> f284991c = new LinkedList<>();

    /* renamed from: com.tencent.mm.ui.chatting.gallery.t$a */
    public class C97129a implements C101611g.C101612b<String, Bitmap> {
        public C97129a() {
        }

        public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
            Bitmap bitmap = (Bitmap) obj2;
            Bitmap bitmap2 = (Bitmap) obj3;
            C97128t.this.f284990b.remove((String) obj);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.t$b */
    public static final class C97130b {

        /* renamed from: a */
        public static C97128t f284993a = new C97128t();
    }

    public C97128t() {
        new QueueWorkerThread(1, "chatting-image-gallery-preload-loader");
    }
}
