package com.tencent.p014mm.plugin.emoji.p040ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.widget.sortlist.DragSortListView;
import com.tencent.p014mm.plugin.emoji.model.C93102b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86312j;
import f40.C86709a0;
import j61.C9283v;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p441aq.C92054g;
import t61.C101728d;
import w51.C102334e;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiSortFragment */
public class EmojiSortFragment extends MMFragment implements MStorage.IOnStorageChange, C11385n {

    /* renamed from: n */
    public static final /* synthetic */ int f268539n = 0;

    /* renamed from: d */
    public C102334e f268540d;

    /* renamed from: e */
    public DragSortListView f268541e;

    /* renamed from: f */
    public C93102b0 f268542f;

    /* renamed from: g */
    public C9283v f268543g;

    /* renamed from: h */
    public ProgressDialog f268544h;

    /* renamed from: i */
    public DragSortListView.C85983j f268545i = new C93150a();

    /* renamed from: j */
    public DragSortListView.C85984n f268546j = new C93151b();

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiSortFragment$a */
    public class C93150a implements DragSortListView.C85983j {
        public C93150a() {
        }

        /* renamed from: b */
        public void mo81248b(int i, int i2) {
            C101728d dVar = (C101728d) EmojiSortFragment.this.f268540d.getItem(i);
            EmojiSortFragment.this.f268542f.onMove(i, i2);
            EmojiSortFragment.this.f268540d.remove(dVar);
            EmojiSortFragment.this.f268540d.insert(dVar, i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiSortFragment$b */
    public class C93151b implements DragSortListView.C85984n {
        public C93151b() {
        }

        public void remove(int i) {
            C102334e eVar = EmojiSortFragment.this.f268540d;
            eVar.remove((C101728d) eVar.getItem(i));
        }
    }

    public EmojiSortFragment(C93102b0 b0Var) {
        super(true);
        this.f268542f = b0Var;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a2a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().add(this);
        C86709a0.m107529k().f251779b.mo123455a(717, this);
    }

    public void onDestroy() {
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().remove(this);
        C86709a0.m107529k().f251779b.mo123470p(717, this);
        super.onDestroy();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        C102334e eVar;
        if (str != null && str.equals("event_update_group") && (eVar = this.f268540d) != null) {
            eVar.f301415f.reset();
            eVar.notifyDataSetChanged();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar == this.f268543g) {
            Log.m105918d("MicroMsg.emoji.EmojiSortUI", "ErrType:" + i + "   errCode:" + i2);
            ProgressDialog progressDialog = this.f268544h;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            if (i == 0 && i2 == 0) {
                this.f268542f.mo127604a();
                finish();
                return;
            }
            C76879j.m92749t(getContext(), getString(C0966R.string.c7y), "", new C93202n0(this));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setBackBtn(new C93196k0(this));
        setMMTitle(getString(C0966R.string.irm));
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C93198l0(this));
        ((TextView) findViewById(C0966R.C0970id.o6k)).setText(C0966R.string.c8u);
        DragSortListView dragSortListView = (DragSortListView) findViewById(16908298);
        this.f268541e = dragSortListView;
        dragSortListView.setDropListener(this.f268545i);
        this.f268541e.setRemoveListener(this.f268546j);
        C102334e eVar = new C102334e(getContext(), this.f268542f);
        this.f268540d = eVar;
        this.f268541e.setAdapter((ListAdapter) eVar);
    }
}
