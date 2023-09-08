package f11;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72963f4;
import g11.C98065a;
import g11.C98068c;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: f11.e */
public abstract class C97796e extends C97792a<C97806o> {
    public C97796e(C92993j jVar, C72963f4 f4Var) {
        super(jVar, f4Var);
    }

    /* renamed from: l */
    public void mo137128l(RecyclerView.C16631z zVar) {
        C97806o oVar = (C97806o) zVar;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            mo137135o(oVar);
        } else {
            MMHandlerThread.postToMainThread(new C97795d(this, oVar));
        }
    }

    /* renamed from: m */
    public String mo137130m() {
        return "";
    }

    /* renamed from: n */
    public void mo137126j(C97806o oVar, int i, C97792a aVar) {
        boolean z;
        C97806o oVar2 = oVar;
        oVar2.f286906A.setTag(this);
        oVar2.f286914I.setTag(this);
        C20828a b = C20828a.m22825b();
        String m = mo137130m();
        ImageView imageView = oVar2.f286906A;
        Context b2 = mo137117b();
        C20937c cVar = C98068c.f287519a.get(4);
        if (cVar == null) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59353i = 1;
            bVar.f59366v = true;
            bVar.f59355k = C76577a.m92145A(b2) / 4;
            bVar.f59354j = C76577a.m92145A(b2) / 4;
            bVar.f59361q = C0966R.color.a88;
            cVar = bVar.mo32666a();
            C98068c.f287519a.put(4, cVar);
        }
        b.mo32519h(m, imageView, cVar);
        View view = oVar2.f286910E;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        oVar2.f286911F.setVisibility(8);
        oVar2.f286908C.setVisibility(8);
        oVar2.f286909D.setVisibility(8);
        View view3 = oVar2.f286914I;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        oVar2.f286913H.setVisibility(0);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            mo137135o(oVar);
        } else {
            MMHandlerThread.postToMainThread(new C97795d(this, oVar2));
        }
        C98065a a = mo137116a();
        long f = mo137122f();
        Map<Long, C98065a.C98066a> map = a.f287512b;
        if (map == null) {
            z = false;
        } else {
            z = ((ConcurrentHashMap) map).containsKey(Long.valueOf(f));
        }
        if (z) {
            oVar2.f286912G.setVisibility(8);
            oVar2.f286913H.setChecked(true);
        } else {
            oVar2.f286912G.setVisibility(0);
            oVar2.f286913H.setChecked(false);
        }
        if (mo137125i()) {
            View view5 = oVar2.f286917z;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(Float.valueOf(1.0f));
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        View view7 = oVar2.f286917z;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(Float.valueOf(0.6f));
        View view8 = view7;
        C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view7.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: o */
    public final void mo137135o(C97806o oVar) {
        int i = this.f286881e;
        if (i == 0) {
            oVar.f286915J.setVisibility(8);
            oVar.f286907B.setVisibility(8);
            oVar.f286913H.setVisibility(0);
            View view = oVar.f286914I;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f286913H.setChecked(false);
            oVar.f286916K.setVisibility(8);
        } else if (i == 1) {
            oVar.f286915J.setVisibility(0);
            oVar.f286907B.setVisibility(8);
            oVar.f286913H.setVisibility(8);
            View view2 = oVar.f286914I;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f286916K.setVisibility(8);
        } else if (i == 2) {
            oVar.f286915J.setVisibility(0);
            oVar.f286907B.setVisibility(0);
            oVar.f286913H.setVisibility(8);
            View view4 = oVar.f286914I;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f286916K.setVisibility(8);
            int i2 = this.f286880d;
            if (i2 > 0) {
                int i3 = (int) ((((float) this.f286879c) / ((float) i2)) * 100.0f);
                if (i3 == -1 || i3 >= 100) {
                    oVar.f286907B.setProgress(100);
                } else {
                    oVar.f286907B.setProgress(i3);
                }
            }
        } else if (i == 3) {
            oVar.f286915J.setVisibility(8);
            oVar.f286907B.setVisibility(8);
            oVar.f286913H.setVisibility(0);
            View view6 = oVar.f286914I;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f286916K.setVisibility(8);
        } else if (i == 4) {
            oVar.f286915J.setVisibility(8);
            oVar.f286907B.setVisibility(8);
            oVar.f286913H.setVisibility(8);
            View view8 = oVar.f286914I;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view9 = view8;
            C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f286916K.setVisibility(0);
        } else if (i == 5) {
            oVar.f286915J.setVisibility(8);
            oVar.f286907B.setVisibility(8);
            oVar.f286913H.setVisibility(8);
            View view10 = oVar.f286914I;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view11 = view10;
            C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f286916K.setVisibility(0);
        }
    }
}
