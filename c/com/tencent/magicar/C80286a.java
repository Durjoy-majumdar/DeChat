package com.tencent.magicar;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.magicar.a */
public class C80286a {

    /* renamed from: a */
    public Context f235046a;

    /* renamed from: b */
    public int f235047b;

    /* renamed from: c */
    public OrientationEventListener f235048c;

    /* renamed from: d */
    public ArrayList<C80288b> f235049d = new ArrayList<>();

    /* renamed from: com.tencent.magicar.a$a */
    public class C80287a extends OrientationEventListener {

        /* renamed from: a */
        public final /* synthetic */ WindowManager f235050a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80287a(Context context, WindowManager windowManager) {
            super(context);
            this.f235050a = windowManager;
        }

        public void onOrientationChanged(int i) {
            int rotation = this.f235050a.getDefaultDisplay().getRotation();
            C80286a aVar = C80286a.this;
            if (aVar.f235047b != rotation) {
                Iterator<C80288b> it = aVar.f235049d.iterator();
                while (it.hasNext()) {
                    it.next().onDisplayOrientationChanged(rotation);
                }
                C80286a.this.f235047b = rotation;
            }
        }
    }

    /* renamed from: com.tencent.magicar.a$b */
    public interface C80288b {
        void onDisplayOrientationChanged(int i);
    }

    public C80286a(Context context) {
        this.f235046a = context;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f235047b = windowManager.getDefaultDisplay().getRotation();
        this.f235048c = new C80287a(context, windowManager);
    }
}
