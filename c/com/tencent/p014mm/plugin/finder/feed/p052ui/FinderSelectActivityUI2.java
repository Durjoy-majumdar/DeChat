package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import cm1.C0750m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.FinderActivityDescUI;
import com.tencent.p014mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader;
import com.tencent.p014mm.plugin.finder.search.eventsearch.FinderActivitySearchViewConfig;
import com.tencent.p014mm.plugin.finder.search.p055ui.FinderSearchBaseUI;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.xweb.WCWebUpdater;
import dp1.C7458x0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kp1.C10380e;
import kp1.C10381f;
import kp1.C10382g;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C49295ek0;
import te3.C52271zj0;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSelectActivityUI2;", "Lcom/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSelectActivityUI2 */
public final class FinderSelectActivityUI2 extends FinderSearchBaseUI {

    /* renamed from: A */
    public String f14795A = "";

    /* renamed from: x */
    public final String f14796x = "Finder.FinderActivitySearchUI";

    /* renamed from: y */
    public final FinderActivitySearchViewConfig f14797y = new FinderActivitySearchViewConfig();

    /* renamed from: z */
    public FinderActivitySearchLoader f14798z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSelectActivityUI2$a */
    public static final class C3046a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectActivityUI2 f14799d;

        /* renamed from: e */
        public final /* synthetic */ FinderActivitySearchLoader f14800e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3046a(FinderSelectActivityUI2 finderSelectActivityUI2, FinderActivitySearchLoader finderActivitySearchLoader) {
            super(1);
            this.f14799d = finderSelectActivityUI2;
            this.f14800e = finderActivitySearchLoader;
        }

        public Object invoke(Object obj) {
            RecyclerView.C16613e adapter;
            int intValue = ((Number) obj).intValue();
            FinderSelectActivityUI2 finderSelectActivityUI2 = this.f14799d;
            int size = this.f14800e.getDataList().size();
            if (size == 0) {
                View view = finderSelectActivityUI2.f16675v;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderSelectActivityUI2.mo3958O7().setVisibility(0);
                    finderSelectActivityUI2.mo3959P7().setVisibility(8);
                } else {
                    C87412m.m108603p("loadingView");
                    throw null;
                }
            } else {
                View view3 = finderSelectActivityUI2.f16675v;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderSelectActivityUI2.mo3958O7().setVisibility(8);
                    finderSelectActivityUI2.mo3959P7().setVisibility(0);
                } else {
                    C87412m.m108603p("loadingView");
                    throw null;
                }
            }
            if (intValue == 0) {
                RecyclerView.C16613e adapter2 = finderSelectActivityUI2.getRecyclerView().getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                }
            } else if (intValue < size && (adapter = finderSelectActivityUI2.getRecyclerView().getAdapter()) != null) {
                adapter.notifyItemRangeInserted(intValue, size - intValue);
            }
            finderSelectActivityUI2.mo3959P7().post(new C10380e(intValue, finderSelectActivityUI2, size));
            JSONObject jSONObject = new JSONObject();
            FinderActivitySearchLoader finderActivitySearchLoader = this.f14799d.f14798z;
            if (finderActivitySearchLoader != null) {
                C7458x0.f25666a.mo8608a("3", C66785b.f191882e.mo90662O5(), jSONObject.put("search_word", finderActivitySearchLoader.f16642d).put("search_res_num", this.f14800e.getDataList().size()).put("vst_id", this.f14799d.f14795A));
                return C13598b0.f38549a;
            }
            C87412m.m108603p("feedloader");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSelectActivityUI2$b */
    public static final class C3047b implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectActivityUI2 f14801d;

        public C3047b(FinderSelectActivityUI2 finderSelectActivityUI2) {
            this.f14801d = finderSelectActivityUI2;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C52271zj0 zj02;
            String str;
            byte[] byteArray;
            String str2;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            FinderActivitySearchLoader finderActivitySearchLoader = this.f14801d.f14798z;
            String str3 = null;
            if (finderActivitySearchLoader != null) {
                Object obj = finderActivitySearchLoader.getDataList().get(i);
                C87412m.m108593f(obj, "feedloader.getSearchDataList()[position]");
                C0740i2 i2Var = (C0740i2) obj;
                FinderSelectActivityUI2 finderSelectActivityUI2 = this.f14801d;
                finderSelectActivityUI2.getClass();
                if ((i2Var instanceof C0750m) && (zj02 = ((C0750m) i2Var).f1768d) != null) {
                    Intent intent = new Intent();
                    String str4 = finderSelectActivityUI2.f14796x;
                    Log.m105924i(str4, "onSelectActivity: eventTopicId:" + zj02 + ".eventTopicId  eventName:" + zj02 + ".eventName description:" + zj02 + ".description cover:" + zj02 + ".coverImgUrl");
                    FinderContact finderContact = zj02.f146006e;
                    String str5 = "";
                    if (finderContact == null || (str = finderContact.username) == null) {
                        str = str5;
                    }
                    intent.putExtra("key_user_name", str);
                    FinderContact finderContact2 = zj02.f146006e;
                    if (finderContact2 != null) {
                        str3 = finderContact2.nickname;
                    }
                    intent.putExtra("key_nick_name", str3);
                    intent.putExtra("key_cover_url", zj02.f146010i);
                    FinderContact finderContact3 = zj02.f146006e;
                    if (!(finderContact3 == null || (str2 = finderContact3.headUrl) == null)) {
                        str5 = str2;
                    }
                    intent.putExtra("key_avatar_url", str5);
                    intent.putExtra("key_topic_id", zj02.f146005d);
                    intent.putExtra("key_activity_name", zj02.f146007f);
                    intent.putExtra("key_activity_desc", zj02.f146008g);
                    intent.putExtra("key_activity_end_time", zj02.f146018t);
                    intent.putExtra("key_activity_type", 102);
                    intent.putExtra("key_activity_already_participate", true);
                    intent.putExtra("key_activity_display_mask", zj02.f146022x);
                    intent.putExtra("vst_id", finderSelectActivityUI2.f14795A);
                    C49295ek0 ek02 = zj02.f146023y;
                    if (!(ek02 == null || (byteArray = ek02.toByteArray()) == null)) {
                        intent.putExtra("key_wording_info", byteArray);
                    }
                    intent.setClass(finderSelectActivityUI2, FinderActivityDescUI.class);
                    finderSelectActivityUI2.startActivityForResult(intent, 0);
                }
                C7458x0.f25666a.mo8608a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, C66785b.f191882e.mo90662O5(), new JSONObject().put("vst_id", this.f14801d.f14795A));
                return;
            }
            C87412m.m108603p("feedloader");
            throw null;
        }
    }

    /* renamed from: N7 */
    public C10381f mo3104N7() {
        FinderActivitySearchLoader finderActivitySearchLoader = this.f14798z;
        if (finderActivitySearchLoader != null) {
            return finderActivitySearchLoader;
        }
        C87412m.m108603p("feedloader");
        throw null;
    }

    /* renamed from: R7 */
    public C10382g mo3105R7() {
        return this.f14797y;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a8q;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        setResult(-1, intent);
        if (i2 == -1 && !isFinishing()) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("vst_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f14795A = stringExtra;
        FinderActivitySearchLoader finderActivitySearchLoader = new FinderActivitySearchLoader();
        finderActivitySearchLoader.f16644f = new C3046a(this, finderActivitySearchLoader);
        this.f14798z = finderActivitySearchLoader;
        super.onCreate(bundle);
        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = this.f16671r;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f173488o = new C3047b(this);
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }
}
