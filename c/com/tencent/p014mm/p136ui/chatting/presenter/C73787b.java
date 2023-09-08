package com.tencent.p014mm.p136ui.chatting.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96789p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import dk3.C75413e;
import dk3.C75414f;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import k20.C9556a;
import nj3.C76879j;
import p716uu.C52617d;
import rk3.C63462a;
import te3.C64878zd0;
import uj3.C78211g;

/* renamed from: com.tencent.mm.ui.chatting.presenter.b */
public abstract class C73787b implements C75413e, C78211g.C78220g {

    /* renamed from: d */
    public Context f216567d;

    /* renamed from: e */
    public String f216568e;

    /* renamed from: f */
    public C75414f f216569f;

    /* renamed from: g */
    public C78211g f216570g;

    /* renamed from: h */
    public LinearLayoutManager f216571h;

    /* renamed from: i */
    public ArrayList<C78211g.C78216c> f216572i = null;

    /* renamed from: j */
    public ArrayList<C78211g.C78216c> f216573j = null;

    /* renamed from: n */
    public boolean f216574n = false;

    /* renamed from: o */
    public long f216575o = 0;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.b$a */
    public class C73788a extends RecyclerView.C0129l {

        /* renamed from: d */
        public int f216576d;

        /* renamed from: e */
        public ColorDrawable f216577e = new ColorDrawable(this.f216576d);

        /* renamed from: f */
        public int f216578f;

        public C73788a() {
            this.f216576d = C73787b.this.f216567d.getResources().getColor(C0966R.color.f3370q9);
            this.f216578f = (int) C73787b.this.f216567d.getResources().getDimension(C0966R.dimen.f3623g);
        }

        /* renamed from: h */
        public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C78211g.C78216c q;
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt.getTag() != null && ((q = C73787b.this.mo102842q(((Integer) childAt.getTag()).intValue() + 1)) == null || q.mo102836a() != Integer.MAX_VALUE)) {
                    int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                    this.f216577e.setBounds(paddingLeft, bottom, width, this.f216578f + bottom);
                    this.f216577e.draw(canvas);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.b$b */
    public class C73789b implements C52617d.C52618a {

        /* renamed from: d */
        public String f216580d = "";

        /* renamed from: e */
        public MTimerHandler f216581e = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C73790a(), false);

        /* renamed from: com.tencent.mm.ui.chatting.presenter.b$b$a */
        public class C73790a implements MTimerHandler.CallBack {

            /* renamed from: com.tencent.mm.ui.chatting.presenter.b$b$a$a */
            public class C73791a implements Runnable {
                public C73791a() {
                }

                public void run() {
                    C73789b bVar = C73789b.this;
                    C75414f fVar = C73787b.this.f216569f;
                    if (fVar != null) {
                        fVar.mo102732t2(bVar.f216580d, false);
                        C73787b.this.f216570g.notifyDataSetChanged();
                    }
                }
            }

            /* renamed from: com.tencent.mm.ui.chatting.presenter.b$b$a$b */
            public class C73792b implements Runnable {
                public C73792b() {
                }

                public void run() {
                    C73787b bVar = C73787b.this;
                    if (bVar.f216569f != null) {
                        bVar.f216570g.notifyDataSetChanged();
                        C73789b bVar2 = C73789b.this;
                        C73787b bVar3 = C73787b.this;
                        bVar3.f216569f.mo102732t2(bVar2.f216580d, bVar3.f216572i.isEmpty());
                    }
                }
            }

            public C73790a() {
            }

            public boolean onTimerExpired() {
                Object[] objArr = new Object[2];
                objArr[0] = Boolean.valueOf(C73787b.this.f216573j == null);
                objArr[1] = Boolean.valueOf(Util.isNullOrNil(C73789b.this.f216580d));
                Log.m105925i("MicroMsg.BaseHistoryListPresenter", "[onTimerExpired]  mDataListCache is null?:%s mSearchText is null?:%s", objArr);
                if (Util.isNullOrNil(C73789b.this.f216580d)) {
                    C73789b bVar = C73789b.this;
                    C73787b bVar2 = C73787b.this;
                    bVar2.f216570g.f229163e = bVar.f216580d;
                    ArrayList<C78211g.C78216c> arrayList = bVar2.f216573j;
                    if (arrayList == null) {
                        bVar2.mo102827g(true);
                    } else {
                        bVar2.f216572i = arrayList;
                        MMHandlerThread.postToMainThread(new C73791a());
                    }
                    return false;
                }
                C73787b bVar3 = C73787b.this;
                bVar3.f216572i = bVar3.f216573j;
                ArrayList<C78211g.C78216c> arrayList2 = new ArrayList<>();
                ArrayList<C78211g.C78216c> arrayList3 = C73787b.this.f216572i;
                if (arrayList3 != null) {
                    Iterator<C78211g.C78216c> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C78211g.C78216c next = it.next();
                        if (next.mo102837d(C73789b.this.f216580d)) {
                            arrayList2.add(next);
                        }
                    }
                }
                C73789b bVar4 = C73789b.this;
                C73787b bVar5 = C73787b.this;
                bVar5.f216572i = arrayList2;
                bVar5.f216570g.f229163e = bVar4.f216580d;
                MMHandlerThread.postToMainThread(new C73792b());
                return false;
            }
        }

        public C73789b() {
        }

        /* renamed from: H1 */
        public void mo63485H1(boolean z, String[] strArr, long j, int i) {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            Log.m105918d("MicroMsg.BaseHistoryListPresenter", "onQuitSearch");
            C75414f fVar = C73787b.this.f216569f;
            if (fVar != null) {
                fVar.onFinish();
            }
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            return false;
        }

        /* renamed from: T3 */
        public void mo63486T3() {
        }

        /* renamed from: U1 */
        public void mo63487U1() {
        }

        /* renamed from: i7 */
        public void mo1323i7() {
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            if (!this.f216580d.equals(str)) {
                this.f216580d = str;
                this.f216581e.stopTimer();
                this.f216581e.startTimer(500);
            }
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
            Log.m105924i("MicroMsg.BaseHistoryListPresenter", "onSearchEditTextReady");
        }
    }

    public C73787b(Context context) {
        this.f216567d = context;
        this.f216572i = new ArrayList<>();
    }

    /* renamed from: a */
    public RecyclerView.C0129l mo102838a(Context context) {
        return new C73788a();
    }

    /* renamed from: b */
    public RecyclerView.LayoutManager mo102839b(Context context) {
        if (this.f216571h == null) {
            this.f216571h = new LinearLayoutManager(context);
        }
        return this.f216571h;
    }

    /* renamed from: d */
    public C52617d.C52618a mo102840d() {
        return new C73789b();
    }

    /* renamed from: h */
    public RecyclerView.C16613e mo102841h(String str) {
        this.f216568e = str;
        this.f216570g = new C78211g(this.f216567d, this);
        C78211g.f229160f = mo102830p();
        return this.f216570g;
    }

    public void onDetach() {
        this.f216569f.mo82061t5(null);
        this.f216569f = null;
        C78211g gVar = this.f216570g;
        if (gVar != null) {
            gVar.getClass();
            C78211g.f229160f = null;
            C78211g.f229161g = null;
        }
    }

    /* renamed from: q */
    public C78211g.C78216c mo102842q(int i) {
        ArrayList<C78211g.C78216c> arrayList = this.f216572i;
        if (arrayList == null || arrayList.size() <= i) {
            return null;
        }
        return this.f216572i.get(i);
    }

    /* renamed from: r */
    public String mo102843r(C72963f4 f4Var, boolean z, boolean z2) {
        String str = null;
        if (f4Var == null) {
            return null;
        }
        if (f4Var.mo108769t2() == 1) {
            return C75592q0.m90789s();
        }
        if (z) {
            str = C75604z3.m90847s(f4Var.getContent());
        } else if (z2) {
            str = f4Var.mo108760m2();
        }
        return Util.isNullOrNil(str) ? f4Var.mo108768t() : str;
    }

    /* renamed from: s */
    public void mo102844s(Context context, String str, long j) {
        Context context2 = context;
        String str2 = str;
        if (str2 == null) {
            Log.m105920e("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] username is null");
            return;
        }
        long msgId = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j).getMsgId();
        Log.m105925i("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] msgLocalId:%s", Long.valueOf(msgId));
        if (!C72996z1.m85820U5(str)) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
            if (z1Var == null || !z1Var.mo62927s3()) {
                if (z1Var == null) {
                    Log.m105929w("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] contact is null! username:%s", str2);
                } else {
                    Log.m105929w("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] isContact not ! username:%s", str2);
                }
                C76879j.m92749t(context, context.getString(C0966R.string.hze), context.getString(C0966R.string.f361465k34), (DialogInterface.OnClickListener) null);
                return;
            }
        } else if (((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(str) == null) {
            Log.m105929w("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] member is null! username:%s", str2);
            C76879j.m92749t(context, context.getString(C0966R.string.hze), context.getString(C0966R.string.f361465k34), (DialogInterface.OnClickListener) null);
            return;
        }
        Intent putExtra = new Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", msgId);
        putExtra.setClass(context, ChattingUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(putExtra);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/chatting/presenter/BaseHistoryListPresenter", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/ui/chatting/presenter/BaseHistoryListPresenter", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: t */
    public void mo102845t(int i, C72963f4 f4Var, int i2) {
        int i3 = i;
        C72963f4 f4Var2 = f4Var;
        int i4 = i2;
        Log.m105925i("MicroMsg.BaseHistoryListPresenter", "[handleSelectedItem] index:%s", Integer.valueOf(i));
        if (f4Var2 == null) {
            Log.m105920e("MicroMsg.BaseHistoryListPresenter", "handleSelectedItem msgInfo is null");
        } else if (i3 == 0) {
            C63462a.f180011a.mo88333h(15, i4);
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
            if (u == null || 51 != u.f195582i || WeChatBrands.Business.Entries.SessionChannels.checkAvailable(this.f216567d)) {
                C115669n.INSTANCE.idkeyStat(219, 19, 1, true);
                boolean endsWith = this.f216568e.toLowerCase().endsWith("@chatroom");
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(f4Var2);
                C73313b1.m86457c(this.f216567d, arrayList, endsWith, this.f216568e, new C73793c(this));
            }
        } else if (i3 == 1) {
            C63462a.f180011a.mo88333h(16, i4);
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(f4Var2);
            if (C96789p0.m124273f(this.f216567d, doFavoriteEvent, this.f216568e, arrayList2, false, false)) {
                DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                aVar.f264688m = 45;
                aVar.f264684i = (Activity) this.f216567d;
                doFavoriteEvent.publish();
                int i5 = doFavoriteEvent.f264675e.f9046a;
                if (i5 != -2 && i5 <= 0 && i5 <= 0) {
                    DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                    if (14 != aVar2.f264678c) {
                        Log.m105918d("MicroMsg.BaseHistoryListPresenter", "not record type, do not report");
                        return;
                    }
                    C64878zd0 zd02 = aVar2.f264677b;
                    if (zd02 == null) {
                        Log.m105920e("MicroMsg.BaseHistoryListPresenter", "want to report record fav, but type count is null");
                        return;
                    }
                    C115669n.INSTANCE.mo160131h(11142, Integer.valueOf(zd02.f186671d), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186672e), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186673f), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186674g), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186675h), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186676i), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186677j), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186678n), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186679o), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186680p), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186681q), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186682r), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186683s), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186684t), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186685u));
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.BaseHistoryListPresenter", "[handleFav] err!");
        } else if (i3 == 2) {
            C63462a.f180011a.mo88333h(17, i4);
            mo102844s(this.f216567d, this.f216568e, f4Var.getMsgId());
        } else if (i3 == 3) {
            C63462a.f180011a.mo88333h(18, i4);
            C115669n.INSTANCE.mo160131h(11627, 5);
            TreeSet treeSet = new TreeSet();
            treeSet.add(Long.valueOf(f4Var.getMsgId()));
            Context context = this.f216567d;
            C76879j.m92707A(context, context.getString(C0966R.string.bj6), "", this.f216567d.getString(C0966R.string.byd), this.f216567d.getString(C0966R.string.f7926wf), new C73794d(this, i4, treeSet, f4Var2), (DialogInterface.OnClickListener) null);
        }
    }
}
