package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p529fv.C59330q;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.p */
public class C56980p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMainUINew f163188d;

    /* renamed from: com.tencent.mm.plugin.mv.ui.shake.p$a */
    public class C56981a implements C44580q1 {
        public C56981a(C56980p pVar) {
        }

        /* renamed from: a */
        public void mo1579a(boolean z, boolean z2) {
            if (z) {
                C56994w wVar = C56994w.f163218a;
                C56994w.f163219b.f156847p = 1;
            } else {
                C56994w wVar2 = C56994w.f163218a;
                C56994w.f163219b.f156847p = 2;
            }
            if (z2) {
                C56994w wVar3 = C56994w.f163218a;
                C56994w.f163219b.f156847p = 3;
            }
            C56994w.f163218a.mo80436a(256);
        }
    }

    public C56980p(MusicMainUINew musicMainUINew) {
        this.f163188d = musicMainUINew;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f163188d.f163145i.f295972t = "wx5aa333606550dfd5";
        AppCompatActivity context = this.f163188d.getContext();
        MusicMainUINew musicMainUINew = this.f163188d;
        ((C59330q) C86312j.m106911c(C59330q.class)).mo84436LI(context, musicMainUINew.f163145i, musicMainUINew.f163159z.mo80430b(musicMainUINew.getContext()), new C56981a(this));
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
