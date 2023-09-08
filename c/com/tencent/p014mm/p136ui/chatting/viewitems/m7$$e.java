package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.chatting.gallery.C73703d;
import com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn;
import com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader;
import com.tencent.p014mm.sdk.platformtools.Log;
import hd0.C98408n0;
import hd0.C98429r0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m7$$e */
public class m7$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98408n0 f217590d;

    /* renamed from: e */
    public final /* synthetic */ C98408n0 f217591e;

    /* renamed from: f */
    public final /* synthetic */ CdnVideoResourceDownloader f217592f;

    public m7$$e(C98408n0 n0Var, C98408n0 n0Var2, CdnVideoResourceDownloader cdnVideoResourceDownloader) {
        this.f217590d = n0Var;
        this.f217591e = n0Var2;
        this.f217592f = cdnVideoResourceDownloader;
    }

    public void run() {
        RoundProgressBtn roundProgressBtn;
        C98408n0 n0Var;
        TextView textView;
        int i;
        WeakReference weakReference = (WeakReference) ((HashMap) C74123m7.f217554z).get(this.f217590d.mo137700d());
        if (weakReference == null) {
            Log.m105929w("MicroMsg.VideoItemHoder", "update status, filename %s, holder not found", this.f217590d.mo137700d());
            return;
        }
        C74123m7 m7Var = (C74123m7) weakReference.get();
        if (m7Var == null) {
            Log.m105929w("MicroMsg.VideoItemHoder", "update status, filename %s, holder gc!", this.f217590d.mo137700d());
            return;
        }
        m7Var.f217559f.setVisibility(8);
        m7Var.f217558e.setVisibility(8);
        m7Var.f217561h.setVisibility(0);
        int i2 = this.f217590d.f288562i;
        Log.m105924i("MicroMsg.VideoItemHoder", "updateStatus videoStatus : " + i2);
        if (i2 == 112 || i2 == 122 || i2 == 120 || ((n0Var = this.f217591e) != null && (((i = n0Var.f288562i) == 120 || i == 199) && this.f217592f != null))) {
            if (this.f217591e != null) {
                m7Var.f217558e.setVisibility(0);
                m7Var.f217561h.setVisibility(8);
                if (this.f217591e.f288562i == 120 && (roundProgressBtn = m7Var.f217576w) != null) {
                    roundProgressBtn.setVisibility(0);
                    m7Var.f217576w.setProgress(C98429r0.m127822m(this.f217590d));
                }
                if (this.f217591e.f288562i == 199) {
                    C73703d.f216412a.mo102768b(this.f217590d.f288567n);
                    RoundProgressBtn roundProgressBtn2 = m7Var.f217576w;
                    if (roundProgressBtn2 != null && roundProgressBtn2.getVisibility() == 0) {
                        m7Var.f217576w.setVisibility(8);
                        View view = m7Var.f217577x;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            m7Var.f217577x.postDelayed(new m7$$e$$c(this, m7Var), 2000);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            m7Var.f217561h.setProgress(C98429r0.m127817h(this.f217590d));
        } else if (C98429r0.m127830u()) {
            m7Var.f217561h.setVisibility(8);
            C74123m7.m88221c(m7Var, 0);
            if (!(i2 == 198 || (textView = m7Var.f217573t) == null)) {
                textView.setVisibility(8);
            }
            if (m7Var.f217572s != null) {
                ((C119157j) C119157j.f356862d).mo183875f(new m7$$e$$a(this.f217590d, m7Var));
            }
        } else {
            m7Var.f217561h.setProgress(C98429r0.m127824o(this.f217590d));
        }
    }
}
