package f11;

import a11.C39479c;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92977a;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.plugin.fav.p047ui.C68924p1;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import g11.C98065a;
import g11.C98068c;
import gc1.C87177b;
import hc0.C20937c;
import j20.C117292a;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: f11.m */
public class C97804m extends C97792a<C97809p> {

    /* renamed from: f */
    public C68070l.C68072b f286894f;

    /* renamed from: g */
    public String f286895g;

    /* renamed from: h */
    public String f286896h;

    /* renamed from: i */
    public String f286897i;

    /* renamed from: j */
    public Integer f286898j;

    /* renamed from: k */
    public String f286899k;

    /* renamed from: l */
    public String f286900l;

    public C97804m(C92993j jVar, C72963f4 f4Var, String str) {
        super(jVar, f4Var);
        this.f286895g = str;
    }

    /* renamed from: c */
    public String mo137118c() {
        return mo137140m() != null ? mo137140m().f195602n : "";
    }

    /* renamed from: d */
    public String mo137119d() {
        if (mo137140m() == null) {
            return "";
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f286895g);
        if (z1Var != null) {
            this.f286897i = z1Var.mo62909j3();
        }
        return mo137140m().f195570f;
    }

    /* renamed from: e */
    public int mo137120e() {
        if (mo137140m() != null) {
            return mo137140m().f195594l;
        }
        return 0;
    }

    /* renamed from: h */
    public int mo137124h() {
        return 1;
    }

    /* renamed from: j */
    public void mo137126j(RecyclerView.C16631z zVar, int i, C97792a aVar) {
        String str;
        boolean z;
        C97809p pVar = (C97809p) zVar;
        pVar.f286932z.setTag(this);
        pVar.f286924E.setTag(this);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(pVar.f286920A, mo137138q());
        TextView textView = pVar.f286921B;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = ((C92977a) this.f286877a).f267793d.getContext();
        if (!Util.isNullOrNil(mo137141n())) {
            str = mo137141n();
        } else if (Util.isNullOrNil(mo137142p())) {
            if (this.f286897i == null) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f286895g);
                if (z1Var != null) {
                    this.f286897i = z1Var.mo62909j3();
                } else {
                    this.f286897i = "";
                }
            }
            str = this.f286897i;
        } else {
            str = mo137142p();
        }
        textView.setText(hVar.yp0(context, str, pVar.f286921B.getTextSize()));
        pVar.f286922C.setText(C68924p1.m81173b(mo137117b(), mo137123g()));
        pVar.f286926G.setImageResource(mo137137o());
        pVar.f286927H.setText(mo137119d());
        if (mo137120e() == 0) {
            pVar.f286928I.setText(Util.getSizeKB((long) mo137120e()));
        } else {
            TextView textView2 = pVar.f286928I;
            textView2.setText(mo137118c().toUpperCase() + " " + Util.getSizeKB((long) mo137120e()));
        }
        if (aVar == null || aVar.mo137124h() != 1) {
            View view = pVar.f286931L;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = pVar.f286931L;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        pVar.f286923D.setVisibility(0);
        View view4 = pVar.f286924E;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pVar.f286929J.setVisibility(8);
        pVar.f286930K.setVisibility(8);
        pVar.f286925F.setVisibility(8);
        if (mo137125i()) {
            pVar.f286932z.setAlpha(1.0f);
        } else {
            pVar.f286932z.setAlpha(0.6f);
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            mo137143r(pVar);
        } else {
            MMHandlerThread.postToMainThread(new C97803l(this, pVar));
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
            pVar.f286923D.setChecked(true);
        } else {
            pVar.f286923D.setChecked(false);
        }
    }

    /* renamed from: k */
    public void mo137127k(View view, C97792a aVar) {
        boolean z;
        boolean z2;
        C98065a a = mo137116a();
        long f = mo137122f();
        synchronized (a) {
            Set<Long> set = a.f287514d;
            z = true;
            if (set != null) {
                if (((HashSet) set).contains(Long.valueOf(f))) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (!z2) {
            int i = this.f286881e;
            if (!(i == 4 || i == 5)) {
                z = false;
            }
            if (!z) {
                if (mo137125i()) {
                    C98068c.m126678c(mo137117b(), mo137122f());
                } else {
                    C98068c.m126683h(mo137117b(), mo137116a().f287511a);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo137128l(RecyclerView.C16631z zVar) {
        C97809p pVar = (C97809p) zVar;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            mo137143r(pVar);
        } else {
            MMHandlerThread.postToMainThread(new C97803l(this, pVar));
        }
    }

    /* renamed from: m */
    public final C68070l.C68072b mo137140m() {
        if (this.f286894f == null) {
            this.f286894f = C68070l.C68072b.m80422u(this.f286878b.getContent(), (String) null);
        }
        return this.f286894f;
    }

    /* renamed from: n */
    public final String mo137141n() {
        if (this.f286900l == null) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f286895g);
            if (z1Var != null) {
                this.f286900l = z1Var.mo73969n2();
            } else {
                this.f286900l = "";
            }
        }
        return this.f286900l;
    }

    /* renamed from: o */
    public int mo137137o() {
        if (this.f286898j == null) {
            this.f286898j = Integer.valueOf(((C87177b) C86312j.m106911c(C87177b.class)).mo121617uh(mo137118c()));
        }
        return this.f286898j.intValue();
    }

    /* renamed from: p */
    public final String mo137142p() {
        if (this.f286899k == null) {
            C44661m1 m1Var = null;
            if (C72996z1.m85820U5(this.f286895g)) {
                m1Var = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f286895g);
            }
            if (m1Var != null) {
                this.f286899k = m1Var.mo69789q2(mo137138q());
            } else {
                this.f286899k = "";
            }
        }
        return this.f286899k;
    }

    /* renamed from: q */
    public String mo137138q() {
        if (this.f286896h == null) {
            C72963f4 f4Var = this.f286878b;
            boolean U5 = C72996z1.m85820U5(this.f286895g);
            LruCache<Integer, C20937c> lruCache = C98068c.f287519a;
            String str = null;
            if (f4Var != null) {
                if (f4Var.mo108769t2() == 1) {
                    str = C75592q0.m90789s();
                } else {
                    if (U5) {
                        str = C75604z3.m90847s(f4Var.getContent());
                    }
                    if (Util.isNullOrNil(str)) {
                        str = f4Var.mo108768t();
                    }
                }
            }
            this.f286896h = str;
        }
        return this.f286896h;
    }

    /* renamed from: r */
    public final void mo137143r(C97809p pVar) {
        int i = this.f286881e;
        if (i == 0) {
            pVar.f286929J.setVisibility(8);
            pVar.f286930K.setVisibility(8);
            pVar.f286923D.setVisibility(0);
            View view = pVar.f286924E;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            pVar.f286923D.setChecked(false);
            pVar.f286925F.setVisibility(8);
        } else if (i == 1) {
            pVar.f286929J.setVisibility(0);
            pVar.f286930K.setVisibility(8);
            pVar.f286923D.setVisibility(8);
            View view2 = pVar.f286924E;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            pVar.f286925F.setVisibility(8);
        } else if (i == 2) {
            pVar.f286929J.setVisibility(0);
            pVar.f286930K.setVisibility(0);
            pVar.f286923D.setVisibility(8);
            View view4 = pVar.f286924E;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            pVar.f286925F.setVisibility(8);
            int i2 = this.f286880d;
            if (i2 > 0) {
                int i3 = (int) ((((float) this.f286879c) / ((float) i2)) * 100.0f);
                if (i3 == -1 || i3 >= 100) {
                    pVar.f286930K.setProgress(100);
                } else {
                    pVar.f286930K.setProgress(i3);
                }
            }
        } else if (i == 3) {
            pVar.f286929J.setVisibility(8);
            pVar.f286930K.setVisibility(8);
            pVar.f286923D.setVisibility(0);
            View view6 = pVar.f286924E;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            pVar.f286925F.setVisibility(8);
        } else if (i == 4) {
            pVar.f286929J.setVisibility(8);
            pVar.f286930K.setVisibility(8);
            pVar.f286923D.setVisibility(8);
            View view8 = pVar.f286924E;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view9 = view8;
            C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            pVar.f286925F.setVisibility(0);
            TextView textView = pVar.f286928I;
            textView.setText(mo137118c().toUpperCase() + " " + mo137117b().getString(C0966R.string.bdb));
        } else if (i == 5) {
            pVar.f286929J.setVisibility(8);
            pVar.f286930K.setVisibility(8);
            pVar.f286923D.setVisibility(8);
            View view10 = pVar.f286924E;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view11 = view10;
            C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            pVar.f286925F.setVisibility(0);
            TextView textView2 = pVar.f286928I;
            textView2.setText(mo137118c().toUpperCase() + " " + mo137117b().getString(C0966R.string.bda));
        }
    }
}
