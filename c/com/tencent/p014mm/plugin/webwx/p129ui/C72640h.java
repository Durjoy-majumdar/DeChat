package com.tencent.p014mm.plugin.webwx.p129ui;

import android.animation.Animator;
import android.view.View;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import e62.C75554c;
import f40.C86709a0;
import fa3.C8003e;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.webwx.ui.h */
public final class C72640h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72632c f211348d;

    /* renamed from: e */
    public final /* synthetic */ C75554c.C75555b f211349e;

    /* renamed from: f */
    public final /* synthetic */ Animator f211350f;

    /* renamed from: com.tencent.mm.plugin.webwx.ui.h$a */
    public static final class C72641a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C75554c.C75555b f211351d;

        /* renamed from: e */
        public final /* synthetic */ C72632c f211352e;

        public C72641a(C75554c.C75555b bVar, C72632c cVar) {
            this.f211351d = bVar;
            this.f211352e = cVar;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            boolean z = true;
            yVar.setHasCallbackToQueue(true);
            Log.m105924i("MicroMsg.LoginDeviceAdapter", this.f211351d.f182221n + ", NetSceneExtDeviceControl errType:" + i + ", errCode:" + i2 + ", errMsg:" + str);
            int i3 = ((C8003e) yVar).f26692e;
            Animator animator = this.f211352e.f211332p0;
            if (animator != null) {
                animator.start();
            }
            if (i == 0 && i2 == 0) {
                C72632c cVar = this.f211352e;
                if (i3 != 1) {
                    z = false;
                }
                cVar.f211334y0 = z;
                C75554c.C75555b bVar = this.f211351d;
                bVar.f221959A = z;
                if (z) {
                    bVar.f182218h |= 4;
                } else {
                    bVar.f182218h &= -5;
                }
                cVar.mo100077C(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append(this.f211351d.f182221n);
                sb.append(", ");
                sb.append(this.f211352e.f211334y0 ? "lock" : "unlock");
                sb.append(" extDevice success");
                Log.m105918d("MicroMsg.LoginDeviceAdapter", sb.toString());
            } else if (i3 == 1) {
                Toast.makeText(this.f211352e.f211335z, C0966R.string.lhp, 0).show();
            } else {
                Toast.makeText(this.f211352e.f211335z, C0966R.string.li_, 0).show();
            }
        }
    }

    public C72640h(C72632c cVar, C75554c.C75555b bVar, Animator animator) {
        this.f211348d = cVar;
        this.f211349e = bVar;
        this.f211350f = animator;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C72632c cVar = this.f211348d;
        if (cVar.f211334y0) {
            cVar.f211320N.setBackgroundResource(C0966R.C0969drawable.f4832o7);
            C72632c cVar2 = this.f211348d;
            cVar2.f211321P.setIconColor(cVar2.f211335z.getResources().getColor(C0966R.color.FG_0));
        } else {
            cVar.f211320N.setBackgroundResource(C0966R.C0969drawable.f4833o8);
            C72632c cVar3 = this.f211348d;
            cVar3.f211321P.setIconColor(cVar3.f211335z.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
        }
        Log.m105924i("MicroMsg.LoginDeviceAdapter", this.f211349e.f182221n + ", lockUnlockWebEx isLock:" + this.f211348d.f211334y0);
        new C8003e(this.f211348d.f211334y0 ? 2 : 1, 1).doScene(C86709a0.m107524d().f256809d, new C72641a(this.f211349e, this.f211348d));
        this.f211348d.f211323R.setVisibility(0);
        this.f211350f.start();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
