package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import com.tencent.p014mm.plugin.finder.wxmessage.FinderWxNotifyTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import dp1.C58417y0;
import f40.C86709a0;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60200t1;
import ht1.C8807v3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jq3.C33631s;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import os1.C11748p;
import os1.C11758v;
import rs1.C63560jb;
import sx3.C110826x0;
import sx3.C64197v;
import ts1.C14078c;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderWxMsgUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderWxMsgUI */
public final class FinderWxMsgUI extends MMFinderUI {

    /* renamed from: p */
    public static final ArrayList<int[]> f161147p = C64197v.m75534c(new int[]{7, 2, 8}, new int[]{3, 5});

    /* renamed from: q */
    public static final int[] f161148q = {7, 8};

    /* renamed from: o */
    public final FinderNotifyContract.NotifyPresenter f161149o = new FinderNotifyContract.NotifyPresenter(2, f161148q, f161147p);

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderWxMsgUI$a */
    public static final class C56368a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderWxMsgUI f161150d;

        public C56368a(FinderWxMsgUI finderWxMsgUI) {
            this.f161150d = finderWxMsgUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f161150d.finish();
            return true;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 117;
    }

    /* renamed from: N7 */
    public final boolean mo79121N7() {
        C37521f.f99374d.getClass();
        return C37521f.f99266Q5.mo60266n().intValue() == 1;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Class<C14078c> cls = C14078c.class;
        if (!mo79121N7()) {
            return C110826x0.m151017e(C63560jb.class, cls);
        }
        return C110826x0.m151017e(cls, FinderWxNotifyTabUIC.class);
    }

    public void initView() {
        if (mo79121N7()) {
            setBackBtn(new C56368a(this));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo79121N7()) {
            ((C8807v3) C39818r.f106831a.mo62444c(this).mo62447c(C8807v3.class)).mo9633R2(true);
            initView();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77239M5("TLWxBubble");
            FinderNotifyContract.NotifyPresenter notifyPresenter = this.f161149o;
            notifyPresenter.f160451r.alive();
            C86709a0.m107524d().mo123455a(978, notifyPresenter);
            int i = notifyPresenter.f160440d;
            if (i == 1 || i == 2) {
                FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = notifyPresenter.f160449p;
                String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                if (Wb == null) {
                    Wb = "";
                }
                finderMsgUIItemBrowseStruct.f155719d = finderMsgUIItemBrowseStruct.mo86045b("SessionId", Wb, true);
                notifyPresenter.f160449p.f155733r = 2;
            }
        }
        View findViewById = findViewById(C0966R.C0970id.izl);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderWxMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderWxMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderWxMsgUI).mo86179qs(this, C76986a.Finder);
    }

    public void onDestroy() {
        super.onDestroy();
        if (mo79121N7()) {
            FinderNotifyContract.NotifyPresenter notifyPresenter = this.f161149o;
            notifyPresenter.f160451r.dead();
            int i = notifyPresenter.f160440d;
            if (i == 1 || i == 2) {
                Iterator<FinderNotifyContract.NotifyViewCallback> it = notifyPresenter.f160447n.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    FinderNotifyContract.NotifyViewCallback next = it.next();
                    int i3 = i2 + 1;
                    LongSparseArray<C33631s> longSparseArray = null;
                    if (i2 >= 0) {
                        FinderNotifyContract.NotifyViewCallback notifyViewCallback = next;
                        List<Boolean> list = notifyPresenter.f160444h;
                        if (!(i2 >= 0 && i2 < ((ArrayList) list).size())) {
                            list = null;
                        }
                        if (list != null ? list.get(i2).booleanValue() : false) {
                            Long l = notifyPresenter.f160445i.get(Integer.valueOf(i2));
                            long longValue = l == null ? 0 : l.longValue();
                            WxRecyclerAdapter<C55011a> wxRecyclerAdapter = notifyViewCallback.f160458j;
                            if (wxRecyclerAdapter != null) {
                                longSparseArray = wxRecyclerAdapter.f165747z;
                            }
                            if (longSparseArray != null) {
                                int size = longSparseArray.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    longSparseArray.keyAt(i4);
                                    C9493c cVar = longSparseArray.valueAt(i4).f91020a;
                                    if (cVar instanceof C55011a) {
                                        if (cVar.getItemId() < longValue || longValue == 0) {
                                            int i5 = ((C55011a) cVar).f154465d.field_type;
                                            if (i5 == 1) {
                                                notifyPresenter.f160449p.f155728m++;
                                            } else if (i5 == 2) {
                                                notifyPresenter.f160449p.f155729n++;
                                            } else if (i5 == 3) {
                                                notifyPresenter.f160449p.f155730o++;
                                            } else if (i5 == 5) {
                                                notifyPresenter.f160449p.f155731p++;
                                            }
                                            notifyPresenter.f160449p.f155723h++;
                                        } else {
                                            int i6 = ((C55011a) cVar).f154465d.field_type;
                                            if (i6 == 1) {
                                                notifyPresenter.f160449p.f155724i++;
                                            } else if (i6 == 2) {
                                                notifyPresenter.f160449p.f155725j++;
                                            } else if (i6 == 3) {
                                                notifyPresenter.f160449p.f155726k++;
                                            } else if (i6 == 5) {
                                                notifyPresenter.f160449p.f155727l++;
                                            }
                                            notifyPresenter.f160449p.f155722g++;
                                        }
                                        notifyPresenter.f160449p.f155721f++;
                                    }
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                notifyPresenter.f160449p.mo86054n();
                ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(notifyPresenter.f160449p);
            }
            Log.m105924i(notifyPresenter.f160443g, "onDetach " + notifyPresenter.f160441e);
            C86709a0.m107524d().mo123470p(978, notifyPresenter);
            notifyPresenter.f160447n.clear();
            return;
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (mo79121N7()) {
            FinderNotifyContract.NotifyPresenter notifyPresenter = this.f161149o;
            notifyPresenter.getClass();
            notifyPresenter.f160446j = System.currentTimeMillis();
        }
    }

    public void onStop() {
        super.onStop();
        if (mo79121N7()) {
            FinderNotifyContract.NotifyPresenter notifyPresenter = this.f161149o;
            notifyPresenter.f160449p.f155732q = System.currentTimeMillis() - notifyPresenter.f160446j;
            C39818r rVar = C39818r.f106831a;
            int n3 = ((FinderWxNotifyTabUIC) rVar.mo62444c(this).mo75002a(FinderWxNotifyTabUIC.class)).mo80060n3();
            C39622i0 a = rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11758v.class);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…StateCacheVM::class.java)");
            C11748p.m11446f3((C11748p) a, 1, n3, (String) null, 4, (Object) null);
        }
    }
}
