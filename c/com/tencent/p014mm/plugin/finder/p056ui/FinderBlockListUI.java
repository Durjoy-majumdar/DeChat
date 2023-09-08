package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import cm1.C0767q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderBlockListContract;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ob0.C117747y;
import pe3.C89349b;
import sx3.C36907w;
import up1.C14272d;
import up1.C14342g0;
import up1.C14348h0;
import up1.C14364t0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBlockListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlockListUI */
public final class FinderBlockListUI extends MMFinderUI {

    /* renamed from: r */
    public static final /* synthetic */ int f16788r = 0;

    /* renamed from: o */
    public final String f16789o = "Finder.FinderBlockListUI";

    /* renamed from: p */
    public FinderBlockListContract.BlockListPresenter f16790p;

    /* renamed from: q */
    public C14364t0 f16791q;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlockListUI$a */
    public static final class C3645a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderBlockListUI f16792d;

        public C3645a(FinderBlockListUI finderBlockListUI) {
            this.f16792d = finderBlockListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f16792d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlockListUI$b */
    public static final class C3646b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderBlockListUI f16793d;

        public C3646b(FinderBlockListUI finderBlockListUI) {
            this.f16793d = finderBlockListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i(this.f16793d.f16789o, "doCallSelectContactUIForMultiRetransmit");
            Intent intent = new Intent();
            intent.setClassName(this.f16793d, "com.tencent.mm.ui.contact.SelectContactUI");
            intent.putExtra("list_type", 1);
            intent.putExtra("titile", this.f16793d.getString(C0966R.string.ece));
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.f219162c);
            FinderBlockListContract.BlockListPresenter blockListPresenter = this.f16793d.f16790p;
            C87412m.m108591d(blockListPresenter);
            ArrayList<C0767q> arrayList = blockListPresenter.f15897f;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (C0767q qVar : arrayList) {
                arrayList2.add(qVar.f1809d.username);
            }
            intent.putExtra("always_select_contact", Util.listToString(arrayList2, ","));
            intent.putExtra("block_contact", C75592q0.m90789s());
            int i = FinderBlockListUI.f16788r;
            intent.putExtra("max_limit_num", 20);
            intent.putExtra("Forbid_SelectChatRoom", true);
            intent.putExtra("show_too_many_member", false);
            this.f16793d.getContext().startActivityForResult(intent, 1);
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a97;
    }

    public void initView() {
        int intExtra = getIntent().getIntExtra("BLOCK_LIST_TYPE", 0);
        C14364t0 dVar = intExtra != 1 ? intExtra != 2 ? intExtra != 3 ? null : new C14272d() : new C14348h0() : new C14342g0();
        this.f16791q = dVar;
        if (dVar == null) {
            finish();
        }
        C14364t0 t0Var = this.f16791q;
        C87412m.m108591d(t0Var);
        setMMTitle(t0Var.mo13644f());
        setBackBtn(new C3645a(this));
        C14364t0 t0Var2 = this.f16791q;
        C87412m.m108591d(t0Var2);
        this.f16790p = new FinderBlockListContract.BlockListPresenter(t0Var2);
        View contentView = getContentView();
        C87412m.m108593f(contentView, "contentView");
        FinderBlockListContract.BlockListPresenter blockListPresenter = this.f16790p;
        C87412m.m108591d(blockListPresenter);
        FinderBlockListContract.BlockListViewCallback blockListViewCallback = new FinderBlockListContract.BlockListViewCallback(this, contentView, blockListPresenter);
        FinderBlockListContract.BlockListPresenter blockListPresenter2 = this.f16790p;
        C87412m.m108591d(blockListPresenter2);
        blockListPresenter2.f15896e = blockListViewCallback;
        C117747y a = C14364t0.C14365a.m13678a(blockListPresenter2.f15895d, (C89349b) null, 1, (Object) null);
        if (a != null) {
            C86709a0.m107524d().mo123455a(a.getType(), blockListPresenter2);
        }
        blockListViewCallback.mo3717a();
        C14364t0 t0Var3 = this.f16791q;
        C87412m.m108591d(t0Var3);
        if (t0Var3.mo13647i()) {
            addIconOptionMenu(0, getString(C0966R.string.ece), (int) C0966R.raw.icons_outlined_add_friends, (MenuItem.OnMenuItemClickListener) new C3646b(this));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            List<String> stringToList = Util.stringToList(intent != null ? intent.getStringExtra("Select_Contact") : null, ",");
            C87412m.m108593f(stringToList, "nameList");
            ArrayList<FinderContact> arrayList = new ArrayList<>(C36907w.m41090l(stringToList, 10));
            for (String str : stringToList) {
                FinderContact finderContact = new FinderContact();
                finderContact.username = str;
                arrayList.add(finderContact);
            }
            FinderBlockListContract.BlockListPresenter blockListPresenter = this.f16790p;
            if (blockListPresenter != null) {
                C14364t0 t0Var = blockListPresenter.f15895d;
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                for (FinderContact finderContact2 : arrayList) {
                    String str2 = finderContact2.username;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList2.add(str2);
                }
                t0Var.mo13639a(arrayList2);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        FinderBlockListContract.BlockListPresenter blockListPresenter = this.f16790p;
        if (blockListPresenter != null) {
            blockListPresenter.onDetach();
        }
    }

    public void onResume() {
        super.onResume();
        FinderBlockListContract.BlockListPresenter blockListPresenter = this.f16790p;
        if (blockListPresenter != null) {
            blockListPresenter.mo3715n();
        }
    }
}
