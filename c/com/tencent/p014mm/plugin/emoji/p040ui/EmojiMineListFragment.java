package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.plugin.emoji.model.C93102b0;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiIPSetInfo;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p441aq.C92054g;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t61.C101726a;
import t61.C101729e;
import t61.C13832c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiMineListFragment;", "Lcom/tencent/mm/ui/MMFragment;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment */
public final class EmojiMineListFragment extends MMFragment implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public final C93102b0 f268492d;

    /* renamed from: e */
    public final String f268493e;

    /* renamed from: f */
    public final C13601g f268494f = C36568h.m40985a(new C93141b(this));

    /* renamed from: g */
    public final C13601g f268495g = C36568h.m40985a(new C93140a(this));

    /* renamed from: h */
    public final EmojiIPSetInfo f268496h;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment$a */
    public static final class C93140a extends C87413o implements C32224a<C101726a> {

        /* renamed from: d */
        public final /* synthetic */ EmojiMineListFragment f268497d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93140a(EmojiMineListFragment emojiMineListFragment) {
            super(0);
            this.f268497d = emojiMineListFragment;
        }

        public Object invoke() {
            Context requireContext = this.f268497d.requireContext();
            C87412m.m108593f(requireContext, "requireContext()");
            return new C101726a(new C101729e(requireContext, 24, 7));
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment$b */
    public static final class C93141b extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ EmojiMineListFragment f268498d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93141b(EmojiMineListFragment emojiMineListFragment) {
            super(0);
            this.f268498d = emojiMineListFragment;
        }

        public Object invoke() {
            return (RecyclerView) this.f268498d.requireView().findViewById(C0966R.C0970id.o6b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiMineListFragment(C93102b0 b0Var, String str) {
        super(true);
        C87412m.m108594g(b0Var, "dataSource");
        this.f268492d = b0Var;
        this.f268493e = str;
        this.f268496h = C30790w2.m39221h().f82786r.mo61530jo(str);
    }

    /* renamed from: K */
    public final C101726a mo127722K() {
        return (C101726a) ((C36570n) this.f268495g).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d7q;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().add(this);
    }

    public void onDestroy() {
        super.onDestroy();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().remove(this);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (C87412m.m108589b(str, "event_update_group")) {
            this.f268492d.reset();
            mo127722K().f297801e.clear();
            mo127722K().f297801e.addAll(this.f268492d.getDataList());
            mo127722K().notifyDataSetChanged();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        mo127722K().f297801e.addAll(this.f268492d.getDataList());
        ((RecyclerView) ((C36570n) this.f268494f).getValue()).setAdapter(mo127722K());
        ((RecyclerView) ((C36570n) this.f268494f).getValue()).setLayoutManager(new LinearLayoutManager(requireContext()));
        Context requireContext = requireContext();
        C87412m.m108593f(requireContext, "requireContext()");
        ((RecyclerView) ((C36570n) this.f268494f).getValue()).mo17085h0(new C13832c(requireContext, 0));
        EmojiIPSetInfo emojiIPSetInfo = this.f268496h;
        setMMTitle(emojiIPSetInfo != null ? emojiIPSetInfo.field_title : null);
        setBackBtn(new C93167d0(this));
        addTextOptionMenu(0, getString(C0966R.string.c7r), new C93169e0(this));
    }
}
