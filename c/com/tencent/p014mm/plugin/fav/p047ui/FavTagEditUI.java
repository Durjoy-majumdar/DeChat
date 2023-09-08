package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C41401c;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C68901b;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavTagPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import p749xh.C66261f3;
import pb1.C100706g0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import pb1.C100759z0;
import te3.C64853yd0;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavTagEditUI */
public class FavTagEditUI extends MMActivity {

    /* renamed from: q */
    public static final /* synthetic */ int f269843q = 0;

    /* renamed from: d */
    public C100755z f269844d;

    /* renamed from: e */
    public List<String> f269845e;

    /* renamed from: f */
    public FavTagPanel f269846f;

    /* renamed from: g */
    public FavTagPanel f269847g;

    /* renamed from: h */
    public ListView f269848h;

    /* renamed from: i */
    public ListView f269849i;

    /* renamed from: j */
    public TextView f269850j;

    /* renamed from: n */
    public C68901b f269851n;

    /* renamed from: o */
    public C41401c f269852o;

    /* renamed from: p */
    public boolean f269853p;

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavTagEditUI$a */
    public class C93456a implements MenuItem.OnMenuItemClickListener {
        public C93456a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FavTagEditUI favTagEditUI = FavTagEditUI.this;
            int i = FavTagEditUI.f269843q;
            favTagEditUI.mo128316I7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavTagEditUI$b */
    public class C93457b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ long f269855d;

        public C93457b(long j) {
            this.f269855d = j;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Class cls = C100718j1.class;
            FavTagEditUI favTagEditUI = FavTagEditUI.this;
            if (favTagEditUI.f269853p) {
                favTagEditUI.mo128315H7();
                return true;
            }
            ArrayList<String> tagList = favTagEditUI.f269847g.getTagList();
            String trim = FavTagEditUI.this.f269847g.getEditText().trim();
            if (!Util.isNullOrNil(trim)) {
                tagList.remove(trim);
                tagList.add(trim);
            }
            FavTagEditUI.this.f269844d = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(this.f269855d);
            FavTagEditUI favTagEditUI2 = FavTagEditUI.this;
            C100755z zVar = favTagEditUI2.f269844d;
            int i = 0;
            if (zVar != null) {
                int intExtra = favTagEditUI2.getIntent().getIntExtra("key_fav_scene", 1);
                if (zVar != null) {
                    Log.m105919d("MicroMsg.FavTagEditUI", "mod tags %s", tagList);
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(zVar.field_tagProto.f186495e);
                    zVar.field_tagProto.f186495e.clear();
                    if (tagList != null && !tagList.isEmpty()) {
                        zVar.field_tagProto.f186495e.addAll(tagList);
                        hashSet.removeAll(tagList);
                    }
                    ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(zVar, C66261f3.COL_LOCALID);
                    C100734q.m131887z0(zVar);
                    ((C100718j1) C86312j.m106911c(cls)).mo128204NU().mo140142h(hashSet);
                    C100734q.m131845e0(zVar, intExtra);
                }
                Intent intent = new Intent();
                intent.putExtra("key_fav_result_list", tagList);
                FavTagEditUI.this.setResult(-1, intent);
            } else {
                String[] strArr = new String[tagList.size()];
                Iterator<String> it = tagList.iterator();
                while (it.hasNext()) {
                    strArr[i] = it.next();
                    i++;
                }
                Intent intent2 = new Intent();
                intent2.putExtra("key_fav_result_array", strArr);
                intent2.putExtra("key_fav_result_list", tagList);
                FavTagEditUI.this.setResult(-1, intent2);
            }
            FavTagEditUI.this.finish();
            FavTagEditUI.this.hideVKB();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavTagEditUI$c */
    public class C93458c implements DialogInterface.OnClickListener {
        public C93458c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            FavTagEditUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public final void mo128315H7() {
        if (this.f269853p) {
            Log.m105928w("MicroMsg.FavTagEditUI", "match max length, disable finish button");
            if (isOptionMenuEnable(0)) {
                enableOptionMenu(0, false);
                return;
            }
            return;
        }
        C100755z zVar = this.f269844d;
        if (zVar == null) {
            if (this.f269847g.getTagCount() > 0 || this.f269847g.getEditText().length() > 0) {
                if (!isOptionMenuEnable(0)) {
                    enableOptionMenu(0, true);
                }
            } else if (isOptionMenuEnable(0)) {
                enableOptionMenu(0, false);
            }
        } else if (zVar.field_tagProto.f186495e.size() == this.f269847g.getTagCount() && this.f269847g.getEditText().length() <= 0) {
            ArrayList<String> tagList = this.f269847g.getTagList();
            int i = 0;
            while (i < tagList.size()) {
                if (tagList.get(i).equals(this.f269844d.field_tagProto.f186495e.get(i))) {
                    i++;
                } else if (!isOptionMenuEnable(0)) {
                    enableOptionMenu(0, true);
                    return;
                } else {
                    return;
                }
            }
            if (isOptionMenuEnable(0)) {
                enableOptionMenu(0, false);
            }
        } else if (!isOptionMenuEnable(0)) {
            enableOptionMenu(0, true);
        }
    }

    /* renamed from: I7 */
    public final void mo128316I7() {
        C76879j.m92707A(getContext(), getString(C0966R.string.f360429cq0), "", getString(C0966R.string.f7570jz), getString(C0966R.string.f7926wf), new C93458c(), (DialogInterface.OnClickListener) null);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a7_;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C100718j1.class;
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("key_fav_item_id", -1);
        if (-1 != longExtra) {
            this.f269844d = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(longExtra);
        }
        this.f269845e = getIntent().getStringArrayListExtra("key_fav_result_list");
        this.f269847g = (FavTagPanel) findViewById(C0966R.C0970id.cwr);
        this.f269848h = (ListView) findViewById(C0966R.C0970id.kej);
        this.f269849i = (ListView) findViewById(C0966R.C0970id.f359140j71);
        this.f269850j = (TextView) findViewById(C0966R.C0970id.gpt);
        this.f269847g.mo101809k(true);
        this.f269847g.setTagEditTextBG(C0966R.C0969drawable.avy);
        this.f269847g.setIsAllowEnterCharacter(true);
        this.f269847g.setCallBack(new C93664j1(this));
        this.f269847g.postDelayed(new C93669k1(this), 100);
        C100755z zVar = this.f269844d;
        if (zVar != null) {
            FavTagPanel favTagPanel = this.f269847g;
            LinkedList<String> linkedList = zVar.field_tagProto.f186495e;
            favTagPanel.mo95190q(linkedList, linkedList);
        } else {
            List<String> list = this.f269845e;
            if (list != null) {
                this.f269847g.mo95190q(list, list);
            }
        }
        C93673l1 l1Var = new C93673l1(this, getContext());
        this.f269851n = l1Var;
        C100755z zVar2 = this.f269844d;
        LinkedList<String> linkedList2 = zVar2 == null ? null : zVar2.field_tagProto.f186495e;
        ((HashSet) l1Var.f198003g).clear();
        if (linkedList2 != null) {
            l1Var.f198003g.addAll(linkedList2);
        }
        C100755z zVar3 = this.f269844d;
        if (zVar3 != null && !zVar3.field_tagProto.f186494d.isEmpty()) {
            View inflate = View.inflate(getContext(), C0966R.C0971layout.a7c, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.cvx);
            textView.setText(getString(C0966R.string.f360430cq1));
            textView.setVisibility(0);
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3811f5);
            FavTagPanel favTagPanel2 = (FavTagPanel) inflate.findViewById(C0966R.C0970id.cwt);
            this.f269846f = favTagPanel2;
            favTagPanel2.setVisibility(0);
            FavTagPanel favTagPanel3 = this.f269846f;
            C64853yd0 yd02 = this.f269844d.field_tagProto;
            favTagPanel3.mo95190q(yd02.f186495e, yd02.f186494d);
            this.f269846f.setBackgroundResource(C0966R.C0969drawable.bcs);
            this.f269846f.setPadding(0, 0, 0, dimensionPixelSize);
            this.f269846f.setCallBack(new C93676m1(this));
            this.f269848h.addHeaderView(inflate);
        }
        if (((C100718j1) C86312j.m106911c(cls)).mo128204NU().mo140139e() > 0) {
            this.f269848h.addHeaderView(View.inflate(getContext(), C0966R.C0971layout.a7b, (ViewGroup) null));
        }
        this.f269848h.setAdapter(this.f269851n);
        this.f269848h.setOnTouchListener(new C93679n1(this));
        C93683o1 o1Var = new C93683o1(this, getContext());
        this.f269852o = o1Var;
        this.f269849i.setAdapter(o1Var);
        this.f269849i.setOnTouchListener(new C93662i1(this));
        setMMTitle((int) C0966R.string.cnr);
        setBackBtn(new C93456a());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C93457b(longExtra), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        mo128315H7();
        ((C100718j1) C86312j.m106911c(cls)).mo128204NU().mo140135a(this.f269851n);
        if (this.f269844d != null) {
            ((C100759z0) C86312j.m106911c(C100759z0.class)).mo61499ni(Long.valueOf(this.f269844d.field_localId));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C100706g0 NU = ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128204NU();
        C68901b bVar = this.f269851n;
        if (bVar == null) {
            NU.getClass();
        } else {
            NU.f295055b.remove(bVar.toString());
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo128316I7();
        return true;
    }
}
