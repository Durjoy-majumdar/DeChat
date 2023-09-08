package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import gy3.C87412m;
import h81.C59774i;
import ht1.C8807v3;
import j20.C117292a;
import java.util.ArrayList;
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
import rs1.C63637s6;
import rs1.C63659v6;
import sx3.C22415w0;
import sx3.C64197v;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderFinderMsgUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI */
public final class FinderFinderMsgUI extends MMFinderUI {

    /* renamed from: o */
    public static final ArrayList<int[]> f161048o = C64197v.m75534c(new int[]{2, 15}, new int[]{3, 5}, new int[]{1, 10});

    /* renamed from: p */
    public static final int[] f161049p = {3, 4, 5};

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI$a */
    public static final class C3662a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFinderMsgUI f16879d;

        public C3662a(FinderFinderMsgUI finderFinderMsgUI) {
            this.f16879d = finderFinderMsgUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f16879d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI$b */
    public static final class C3663b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFinderMsgUI f16880d;

        public C3663b(FinderFinderMsgUI finderFinderMsgUI) {
            this.f16880d = finderFinderMsgUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderFinderMsgUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            C58684b bVar = (C58684b) c;
            AppCompatActivity context = this.f16880d.getContext();
            C87412m.m108593f(context, "this.context");
            Intent intent = new Intent();
            intent.setClass(context, FinderSettingMsgUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderMessageSettingUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderMessageSettingUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderFinderMsgUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public FinderFinderMsgUI() {
        new FinderNotifyContract.NotifyPresenter(1, f161049p, f161048o);
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 7;
    }

    public void dealContentView(View view) {
        super.dealContentView(view);
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C63637s6.class);
    }

    public void initView() {
        setMMTitle((int) C0966R.string.d4k);
        setBackBtn(new C3662a(this));
        View findViewById = findViewById(C0966R.C0970id.izl);
        C37521f.f99374d.getClass();
        if (C37521f.f99404g3.mo60266n().intValue() == 1) {
            findViewById.setOnClickListener(new C3663b(this));
            return;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderFinderMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/ui/FinderFinderMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C8807v3) C39818r.f106831a.mo62444c(this).mo62447c(C8807v3.class)).mo9633R2(true);
        initView();
        FinderNotifyContractNew.f160522a.getClass();
        FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = FinderNotifyContractNew.f160523b;
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderMsgUIItemBrowseStruct.f155719d = finderMsgUIItemBrowseStruct.mo86045b("SessionId", Wb, true);
        finderMsgUIItemBrowseStruct.f155733r = 2;
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderFinderMsgUI).mo86179qs(this, C76986a.Finder);
    }

    public void onDestroy() {
        Class cls = C63637s6.class;
        C39818r rVar = C39818r.f106831a;
        Log.m105924i("FinderMsgNotifyUI", "onDestroy lastTabIndex :" + ((C63637s6) rVar.mo62444c(this).mo75002a(cls)).mo80060n3());
        super.onDestroy();
        ArrayList<FinderNotifyContractNew.NotifyPresenter> arrayList = new ArrayList<>();
        for (FinderHomeTabFragment d : ((C63637s6) rVar.mo62444c(this).mo75002a(cls)).mo80061o3()) {
            FinderNotifyContractNew.NotifyPresenter notifyPresenter = ((C63659v6) C39818r.f106831a.mo62445d(d).mo75002a(C63659v6.class)).f180479h;
            if (notifyPresenter != null) {
                arrayList.add(notifyPresenter);
            }
        }
        FinderNotifyContractNew.f160522a.getClass();
        Log.m105924i("Finder.NotifyContractNew", "reportBrowser");
        for (FinderNotifyContractNew.NotifyPresenter notifyPresenter2 : arrayList) {
            if (notifyPresenter2.f160531j) {
                long j = notifyPresenter2.f160532n;
                FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = notifyPresenter2.f160538t;
                LongSparseArray<C33631s> longSparseArray = null;
                if (notifyViewCallback != null) {
                    WxRecyclerAdapter<C55011a> wxRecyclerAdapter = notifyViewCallback.f160553r;
                    if (wxRecyclerAdapter != null) {
                        longSparseArray = wxRecyclerAdapter.f165747z;
                    }
                    if (longSparseArray != null) {
                        int size = longSparseArray.size();
                        for (int i = 0; i < size; i++) {
                            longSparseArray.keyAt(i);
                            FinderNotifyContractNew.f160522a.getClass();
                            C9493c cVar = longSparseArray.valueAt(i).f91020a;
                            if (cVar instanceof C55011a) {
                                if (cVar.getItemId() < j || j == 0) {
                                    int i2 = ((C55011a) cVar).f154465d.field_type;
                                    if (i2 == 1) {
                                        FinderNotifyContractNew.f160523b.f155728m++;
                                    } else if (i2 == 2) {
                                        FinderNotifyContractNew.f160523b.f155729n++;
                                    } else if (i2 == 3) {
                                        FinderNotifyContractNew.f160523b.f155730o++;
                                    } else if (i2 == 5) {
                                        FinderNotifyContractNew.f160523b.f155731p++;
                                    }
                                    FinderNotifyContractNew.f160523b.f155723h++;
                                } else {
                                    int i3 = ((C55011a) cVar).f154465d.field_type;
                                    if (i3 == 1) {
                                        FinderNotifyContractNew.f160523b.f155724i++;
                                    } else if (i3 == 2) {
                                        FinderNotifyContractNew.f160523b.f155725j++;
                                    } else if (i3 == 3) {
                                        FinderNotifyContractNew.f160523b.f155726k++;
                                    } else if (i3 == 5) {
                                        FinderNotifyContractNew.f160523b.f155727l++;
                                    }
                                    FinderNotifyContractNew.f160523b.f155722g++;
                                }
                                FinderNotifyContractNew.f160523b.f155721f++;
                            }
                        }
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
        }
        FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = FinderNotifyContractNew.f160523b;
        finderMsgUIItemBrowseStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderMsgUIItemBrowseStruct);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("FinderMsgNotifyUI", "onPause");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("FinderMsgNotifyUI", "onResume");
    }

    public void onStop() {
        super.onStop();
        C39818r rVar = C39818r.f106831a;
        int n3 = ((C63637s6) rVar.mo62444c(this).mo75002a(C63637s6.class)).mo80060n3();
        Log.m105924i("FinderMsgNotifyUI", "onStop lastTabIndex :" + n3);
        C39622i0 a = rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11748p.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…StateCacheVM::class.java)");
        C11748p.m11446f3((C11748p) a, 1, n3, (String) null, 4, (Object) null);
    }
}
