package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BannerOnInitEvent;
import com.tencent.p014mm.autogen.events.BannerToAddEvent;
import com.tencent.p014mm.autogen.events.MainUIShowListviewEvent;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.conversation.banner.C30849l0;
import com.tencent.p014mm.p136ui.conversation.banner.C74666h;
import com.tencent.p014mm.p136ui.conversation.banner.C97204d;
import com.tencent.p014mm.p136ui.conversation.banner.InviteFriendBanner;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import di3.C86312j;
import eb0.C31461f3;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import gb0.C75896b;
import j20.C117292a;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import mj3.C76772b;
import p196ln.C10579k;
import p196ln.C76706g;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.BannerHelper */
public class BannerHelper implements C10579k.C10580a, MStorageEx.IOnStorageChange, C31461f3 {

    /* renamed from: d */
    public List<C78802b> f219269d = new LinkedList();

    /* renamed from: e */
    public List<C78802b> f219270e = new LinkedList();

    /* renamed from: f */
    public List<C78802b> f219271f = new LinkedList();

    /* renamed from: g */
    public List<C78802b> f219272g = new LinkedList();

    /* renamed from: h */
    public List<C78802b> f219273h = new LinkedList();

    /* renamed from: i */
    public List<C78802b> f219274i = new LinkedList();

    /* renamed from: j */
    public C29060q f219275j;

    /* renamed from: n */
    public IListener f219276n;

    /* renamed from: o */
    public IListener f219277o;

    /* renamed from: p */
    public Context f219278p;

    /* renamed from: q */
    public ListView f219279q;

    /* renamed from: r */
    public View f219280r;

    /* renamed from: s */
    public boolean f219281s = false;

    /* renamed from: com.tencent.mm.ui.conversation.BannerHelper$a */
    public class C74606a implements Comparator<C78802b> {
        public C74606a(BannerHelper bannerHelper) {
        }

        public int compare(Object obj, Object obj2) {
            return ((C78802b) obj2).mo7974c() - ((C78802b) obj).mo7974c();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BannerHelper$b */
    public class C74607b extends C29060q.C29061a {

        /* renamed from: d */
        public final MTimerHandler f219284d = new MTimerHandler(new C74608a(), false);

        /* renamed from: com.tencent.mm.ui.conversation.BannerHelper$b$a */
        public class C74608a implements MTimerHandler.CallBack {
            public C74608a() {
            }

            public boolean onTimerExpired() {
                BannerHelper.this.mo103670h();
                return false;
            }
        }

        public C74607b() {
        }

        public void onNetworkChange(int i) {
            MTimerHandler mTimerHandler = this.f219284d;
            if (mTimerHandler != null) {
                mTimerHandler.startTimer(10);
            }
        }
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        if (C97625j3.m125811a() && !C86718e.m107551r() && Util.nullAsNil(str).length() > 0 && str.equals(C75592q0.m90789s())) {
            mo103670h();
        }
    }

    /* renamed from: a */
    public final void mo103663a(List<C78802b> list) {
        for (C78802b a : list) {
            a.mo7968a();
        }
        list.clear();
    }

    /* renamed from: b */
    public final void mo103664b(List<C78802b> list) {
        for (C78802b g : list) {
            g.mo7975g(8);
        }
    }

    /* renamed from: c */
    public void mo103665c(Context context, ListView listView, View view) {
        this.f219278p = context;
        this.f219279q = listView;
        this.f219280r = view;
        C746041 r9 = new IListener<BannerToAddEvent>(C40008f.f107254d) {
            {
                this.__eventId = 1216409744;
            }

            public boolean callback(IEvent iEvent) {
                BannerToAddEvent bannerToAddEvent = (BannerToAddEvent) iEvent;
                C78802b bVar = bannerToAddEvent.f193489d.f193492c;
                if (bVar == null || bVar.getView() == null) {
                    Log.m105929w("MicroMsg.BannerHelper", "banner is null, event:%s", bannerToAddEvent);
                } else {
                    Log.m105925i("MicroMsg.BannerHelper", "now add banner:%s, hc:%d", bVar, Integer.valueOf(BannerHelper.this.hashCode()));
                    BannerToAddEvent.C67662a aVar = bannerToAddEvent.f193489d;
                    if (aVar.f193490a) {
                        ((LinkedList) BannerHelper.this.f219269d).add(bVar);
                    } else {
                        int i = aVar.f193491b;
                        if (i == 1) {
                            ((LinkedList) BannerHelper.this.f219270e).add(bVar);
                        } else if (i != 2) {
                            ((LinkedList) BannerHelper.this.f219272g).add(bVar);
                        } else {
                            ((LinkedList) BannerHelper.this.f219271f).add(bVar);
                        }
                    }
                }
                return false;
            }
        };
        this.f219277o = r9;
        r9.alive();
        BannerOnInitEvent bannerOnInitEvent = new BannerOnInitEvent();
        bannerOnInitEvent.f193487d.f193488a = (Activity) context;
        bannerOnInitEvent.publish();
        BannerToAddEvent bannerToAddEvent = new BannerToAddEvent();
        bannerToAddEvent.f193489d.f193492c = (C78802b) C74666h.m89417a(this.f219278p, C74666h.C74667a.MAIN_FRAME_AND_ABTEST_BANNER, (Object[]) null);
        bannerToAddEvent.publish();
        BannerToAddEvent bannerToAddEvent2 = new BannerToAddEvent();
        BannerToAddEvent.C67662a aVar = bannerToAddEvent2.f193489d;
        aVar.f193492c = (C78802b) C74666h.m89417a(this.f219278p, C74666h.C74667a.NET_WARN_BANNER, (Object[]) null);
        aVar.f193491b = 1;
        bannerToAddEvent2.publish();
        if (Environment.getExternalStorageDirectory().getAbsolutePath().toLowerCase().contains("appclone")) {
            BannerToAddEvent bannerToAddEvent3 = new BannerToAddEvent();
            BannerToAddEvent.C67662a aVar2 = bannerToAddEvent3.f193489d;
            aVar2.f193492c = (C78802b) C74666h.m89417a(this.f219278p, C74666h.C74667a.STORAGE_PERMISSION_BANNER, (Object[]) null);
            aVar2.f193491b = 1;
            bannerToAddEvent3.publish();
        }
        BannerToAddEvent bannerToAddEvent4 = new BannerToAddEvent();
        BannerToAddEvent.C67662a aVar3 = bannerToAddEvent4.f193489d;
        aVar3.f193492c = (C78802b) C74666h.m89417a(this.f219278p, C74666h.C74667a.OTHER_ONLINE_BANNER, (Object[]) null);
        aVar3.f193490a = false;
        aVar3.f193491b = 1;
        bannerToAddEvent4.publish();
        BannerToAddEvent bannerToAddEvent5 = new BannerToAddEvent();
        BannerToAddEvent.C67662a aVar4 = bannerToAddEvent5.f193489d;
        aVar4.f193492c = (C30849l0) C74666h.m89417a(this.f219278p, C74666h.C74667a.TRY_NEW_INIT_BANNER, (Object[]) null);
        aVar4.f193490a = false;
        aVar4.f193491b = 2;
        bannerToAddEvent5.publish();
        BannerToAddEvent bannerToAddEvent6 = new BannerToAddEvent();
        BannerToAddEvent.C67662a aVar5 = bannerToAddEvent6.f193489d;
        aVar5.f193492c = (C97204d) C74666h.m89417a(this.f219278p, C74666h.C74667a.AD_BANNER, (Object[]) null);
        aVar5.f193490a = false;
        aVar5.f193491b = 3;
        bannerToAddEvent6.publish();
        Context context2 = this.f219278p;
        C74666h.C74667a aVar6 = C74666h.C74667a.CHATTING_MONITORED_HINT;
        Object[] objArr = {C75896b.C75898b.Main};
        BannerToAddEvent bannerToAddEvent7 = new BannerToAddEvent();
        BannerToAddEvent.C67662a aVar7 = bannerToAddEvent7.f193489d;
        aVar7.f193492c = (C76772b) C74666h.m89417a(context2, aVar6, objArr);
        aVar7.f193490a = true;
        bannerToAddEvent7.publish();
        this.f219277o.dead();
        ((LinkedList) this.f219274i).addAll(this.f219269d);
        ((LinkedList) this.f219274i).addAll(this.f219270e);
        ((LinkedList) this.f219274i).addAll(this.f219271f);
        ((LinkedList) this.f219274i).addAll(this.f219272g);
        Collections.sort(this.f219274i, new C74606a(this));
        for (C78802b view2 : this.f219274i) {
            this.f219279q.addHeaderView(view2.getView());
        }
        new LinkedList();
        C78802b bVar = (C78802b) C74666h.m89417a(context, C74666h.C74667a.FACEBOOK_BANNER, (Object[]) null);
        if (!(bVar == null || bVar.getView() == null)) {
            listView.addFooterView(bVar.getView());
        }
        ((LinkedList) this.f219273h).add(bVar);
        listView.addFooterView(new InviteFriendBanner(context).f24652h, (Object) null, true);
        ((LinkedList) this.f219273h).add(bVar);
        C74607b bVar2 = new C74607b();
        this.f219275j = bVar2;
        C86709a0.m107528h();
        C86709a0.m107529k().mo121126a(bVar2);
        C746054 r7 = new IListener<MainUIShowListviewEvent>(C40008f.f107254d) {
            {
                this.__eventId = -599117475;
            }

            public boolean callback(IEvent iEvent) {
                MainUIShowListviewEvent mainUIShowListviewEvent = (MainUIShowListviewEvent) iEvent;
                if (BannerHelper.this.f219279q.getVisibility() != 0) {
                    BannerHelper.this.f219279q.setVisibility(0);
                    View view = BannerHelper.this.f219280r;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/conversation/BannerHelper$4", "callback", "(Lcom/tencent/mm/autogen/events/MainUIShowListviewEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/ui/conversation/BannerHelper$4", "callback", "(Lcom/tencent/mm/autogen/events/MainUIShowListviewEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                return false;
            }
        };
        this.f219276n = r7;
        r7.alive();
        C97625j3.m125812b().mo105886a(this);
        mo103670h();
    }

    /* renamed from: d */
    public void mo103666d() {
        Log.m105924i("MicroMsg.BannerHelper", "releaseBanner");
        if (this.f219281s) {
            this.f219281s = false;
            mo103668f(this.f219269d);
            mo103668f(this.f219270e);
            mo103668f(this.f219271f);
            mo103668f(this.f219272g);
            for (C78802b next : this.f219273h) {
                if (next != null) {
                    next.mo7971f();
                }
            }
            if (C97625j3.m125811a()) {
                ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).f195667a.remove(this);
            }
            if (C97625j3.m125811a()) {
                C97625j3.m125812b().mo105906u().remove(this);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo103667e(List<C78802b> list, boolean z) {
        boolean z2 = false;
        for (C78802b next : list) {
            View childAt = ((ViewGroup) next.getView()).getChildAt(0);
            if (next.mo7970e()) {
                Object[] objArr = new Object[4];
                objArr[0] = next;
                objArr[1] = Boolean.valueOf(z);
                objArr[2] = Boolean.valueOf(childAt != null && childAt.getVisibility() == 0);
                objArr[3] = Integer.valueOf(hashCode());
                Log.m105925i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[true] :%s, checkAll:%b, isVisible:%b, hc:%d", objArr);
                if (!z) {
                    return true;
                }
                z2 = true;
            } else if (childAt != null && childAt.getVisibility() == 0) {
                Log.m105925i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[false] but visible :%s, checkAll:%b, hc:%d", next, Boolean.valueOf(z), Integer.valueOf(hashCode()));
            }
        }
        return z2;
    }

    /* renamed from: f */
    public final void mo103668f(List<C78802b> list) {
        for (C78802b f : list) {
            f.mo7971f();
        }
    }

    /* renamed from: f4 */
    public void mo24653f4() {
        mo103670h();
    }

    /* renamed from: g */
    public final void mo103669g(List<C78802b> list) {
        for (C78802b next : list) {
            if (next.getView() != null) {
                this.f219279q.removeHeaderView(next.getView());
            }
        }
    }

    /* renamed from: h */
    public void mo103670h() {
        View childAt;
        if (this.f219278p != null && C97625j3.m125811a()) {
            Log.m105925i("MicroMsg.BannerHelper", "updateBanner, :%d", Integer.valueOf(hashCode()));
            boolean e = mo103667e(this.f219269d, true);
            boolean e2 = mo103667e(this.f219270e, true);
            boolean e3 = mo103667e(this.f219271f, true);
            boolean z = e || e2 || e3 || mo103667e(this.f219272g, true);
            if (e2) {
                mo103664b(this.f219271f);
                mo103664b(this.f219272g);
            } else if (e3) {
                mo103664b(this.f219272g);
            }
            LinkedList<C78802b> linkedList = new LinkedList<>();
            for (C78802b next : this.f219274i) {
                if (!(next == null || (childAt = ((ViewGroup) next.getView()).getChildAt(0)) == null || childAt.getVisibility() != 0)) {
                    next.f230567d = false;
                    next.f230568e = false;
                    linkedList.add(next);
                }
            }
            if (linkedList.size() > 0) {
                ((C78802b) linkedList.getFirst()).f230567d = true;
                ((C78802b) linkedList.getLast()).f230568e = true;
                for (C78802b e4 : linkedList) {
                    e4.mo7970e();
                }
            }
            if (z && this.f219279q.getVisibility() != 0) {
                this.f219279q.setVisibility(0);
                View view = this.f219280r;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/BannerHelper", "updateBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/BannerHelper", "updateBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            for (C78802b next2 : this.f219273h) {
                if (next2 != null) {
                    next2.mo7970e();
                }
            }
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (C97625j3.m125811a() && mStorageEx == C97625j3.m125812b().mo105906u()) {
            int nullAsInt = Util.nullAsInt(obj, 0);
            if (8193 == nullAsInt) {
                mo103670h();
            }
            if (42 == nullAsInt) {
                mo103670h();
            }
        }
    }
}
