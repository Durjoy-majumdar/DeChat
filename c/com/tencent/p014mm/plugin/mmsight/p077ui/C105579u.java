package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.u */
public class C105579u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105562q f314027d;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.u$a */
    public class C105580a implements Runnable {
        public C105580a() {
        }

        public void run() {
            C105579u.this.f314027d.f313997p.mo150279c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.u$b */
    public class C105581b implements Runnable {
        public C105581b() {
        }

        public void run() {
            C105579u.this.f314027d.f313997p.mo150279c();
        }
    }

    public C105579u(C105562q qVar) {
        this.f314027d = qVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/MMSightVideoEditor$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C105562q qVar = this.f314027d;
        if (!qVar.f313999r && qVar.f313984c <= qVar.f314000s.f267170h) {
            qVar.f313986e = -1;
            qVar.f313985d = -1;
            qVar.f313998q.mo129486b();
            C105562q qVar2 = this.f314027d;
            qVar2.f313982a = qVar2.f313998q.f272141d;
            qVar2.f313983b = false;
        }
        C105562q qVar3 = this.f314027d;
        if (qVar3.f313981C) {
            qVar3.mo150415c();
            C105562q qVar4 = this.f314027d;
            if (!qVar4.f313999r && qVar4.f313980B && qVar4.f313997p != null) {
                MMHandlerThread.postToMainThread(new C105581b());
            }
        } else if (qVar3.f313997p != null) {
            MMHandlerThread.postToMainThread(new C105580a());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/MMSightVideoEditor$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
