package com.tencent.p014mm.p136ui.bizchat;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import p629ny.C76979h;
import rb0.C48009v0;
import sb0.C48334c;
import sb0.C48340e;
import sb0.C48353j;
import sb0.C48354k;

/* renamed from: com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI */
public class BizChatAtSomeoneUI extends MMActivity {

    /* renamed from: o */
    public static boolean f121315o;

    /* renamed from: d */
    public ListView f121316d;

    /* renamed from: e */
    public C44728e f121317e;

    /* renamed from: f */
    public String f121318f;

    /* renamed from: g */
    public String f121319g;

    /* renamed from: h */
    public C48334c f121320h;

    /* renamed from: i */
    public C106742j1 f121321i;

    /* renamed from: j */
    public String f121322j;

    /* renamed from: n */
    public long f121323n;

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI$a */
    public class C44724a implements MenuItem.OnMenuItemClickListener {
        public C44724a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BizChatAtSomeoneUI.this.setResult(0);
            BizChatAtSomeoneUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI$b */
    public class C44725b implements C106742j1.C106756o {
        public C44725b() {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            return false;
        }

        /* renamed from: i7 */
        public void mo1323i7() {
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            C44728e eVar = BizChatAtSomeoneUI.this.f121317e;
            eVar.f121330r = str;
            eVar.mo7991f();
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI$c */
    public class C44726c implements AdapterView.OnItemClickListener {
        public C44726c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatAtSomeoneUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Intent intent = new Intent();
            if (i != 0 || !BizChatAtSomeoneUI.f121315o) {
                C48353j jVar = (C48353j) BizChatAtSomeoneUI.this.f121317e.getItem(i);
                C48334c cVar = BizChatAtSomeoneUI.this.f121320h;
                String n2 = cVar == null ? null : cVar.mo73035n2(jVar.field_userId);
                intent.putExtra("select_raw_user_name", jVar.field_userId);
                intent.putExtra("Select_Conv_User", n2);
            } else {
                intent.putExtra("Select_Conv_User", BizChatAtSomeoneUI.this.getString(C0966R.string.a_d, new Object[]{""}));
                intent.putExtra("select_raw_user_name", "notify@all");
            }
            BizChatAtSomeoneUI.this.setResult(-1, intent);
            BizChatAtSomeoneUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatAtSomeoneUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI$d */
    public class C44727d implements AbsListView.OnScrollListener {
        public C44727d(BizChatAtSomeoneUI bizChatAtSomeoneUI) {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatAtSomeoneUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatAtSomeoneUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatAtSomeoneUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C20828a.m22825b().mo32525n(i);
            C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatAtSomeoneUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI$e */
    public static class C44728e extends C6975i1<C48353j> {

        /* renamed from: o */
        public String[] f121327o;

        /* renamed from: p */
        public List<String> f121328p;

        /* renamed from: q */
        public C48334c f121329q;

        /* renamed from: r */
        public String f121330r;

        /* renamed from: s */
        public C20937c f121331s = null;

        public C44728e(Context context, C48353j jVar, C48334c cVar, String[] strArr, List<String> list) {
            super(context, jVar);
            this.f121329q = cVar;
            this.f121327o = strArr;
            this.f121328p = list;
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59351g = C48340e.m53671l(cVar.field_brandUserName);
            bVar.f59346b = true;
            bVar.f59363s = true;
            bVar.f59359o = C0966R.raw.default_avatar;
            this.f121331s = bVar.mo32666a();
            BitmapUtil.transformDrawableToBitmap(context.getResources().getDrawable(C0966R.raw.at_all_avater));
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C48353j jVar = (C48353j) obj;
            C48353j jVar2 = new C48353j();
            jVar2.convertFrom(cursor);
            return jVar2;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C44729f fVar;
            String str = null;
            if (view == null) {
                view = View.inflate(this.f24696e, C0966R.C0971layout.f6522h6, (ViewGroup) null);
                fVar = new C44729f();
                fVar.f121332a = (MaskLayout) view.findViewById(C0966R.C0970id.f6178zh);
                fVar.f121333b = (TextView) view.findViewById(C0966R.C0970id.f6179zi);
                view.setTag(fVar);
            } else {
                fVar = (C44729f) view.getTag();
            }
            if (i != 0 || !BizChatAtSomeoneUI.f121315o) {
                C48353j jVar = (C48353j) getItem(i - (BizChatAtSomeoneUI.f121315o ? 1 : 0));
                fVar.f121333b.setTextColor(C76577a.m92154e(this.f24696e, C0966R.color.a4r));
                C20828a.m22825b().mo32519h(jVar.field_headImageUrl, (ImageView) fVar.f121332a.getContentView(), this.f121331s);
                fVar.f121332a.setMaskDrawable((Drawable) null);
                C48334c cVar = this.f121329q;
                String str2 = jVar.field_userId;
                if (cVar != null) {
                    str = cVar.mo73035n2(str2);
                }
                fVar.f121333b.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f24696e, str, fVar.f121333b.getTextSize()));
                return view;
            }
            fVar.getClass();
            throw null;
        }

        /* renamed from: i */
        public int mo6470i() {
            return BizChatAtSomeoneUI.f121315o ? 1 : 0;
        }

        /* renamed from: k */
        public /* bridge */ /* synthetic */ Object mo7995k() {
            return null;
        }

        /* renamed from: l */
        public void mo1332l() {
            mo1333o();
        }

        /* renamed from: n */
        public boolean mo7996n(int i) {
            return false;
        }

        /* renamed from: o */
        public void mo1333o() {
            String str;
            String str2;
            mo5580b();
            C48354k Bx0 = C48009v0.Bx0();
            String[] strArr = this.f121327o;
            String str3 = this.f121330r;
            List<String> list = this.f121328p;
            Bx0.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("select * ");
            sb.append(" from ");
            sb.append("BizChatUserInfo");
            sb.append(" where ");
            String str4 = "";
            if (strArr == null || strArr.length == 0) {
                str = str4;
            } else {
                StringBuilder sb4 = new StringBuilder(" 1=1 ");
                if (list == null || list.size() <= 0) {
                    str2 = str4;
                } else {
                    str2 = str4;
                    for (String str5 : list) {
                        str2 = str2 + " and userId != '" + str5 + "'";
                    }
                }
                sb4.append(str2);
                sb4.append(" and ");
                sb4.append("userId");
                sb4.append(" in(");
                for (int i = 0; i < strArr.length; i++) {
                    if (i > 0) {
                        sb4.append(" , ");
                    }
                    sb4.append(" '");
                    sb4.append(strArr[i]);
                    sb4.append("' ");
                }
                sb4.append(" )");
                str = sb4.toString();
            }
            sb.append(str);
            if (str3 != null && !str3.equals(str4)) {
                str4 = " and (" + "userName like '%" + str3 + "%' )";
            }
            sb.append(str4);
            sb.append(" order by ");
            sb.append(" case when length(BizChatUserInfo.userNamePY) > 0 then upper(BizChatUserInfo.userNamePY)  else upper(BizChatUserInfo.userName) end asc,  upper(BizChatUserInfo.userNamePY) asc,  upper(BizChatUserInfo.userName) asc ");
            mo7998r(Bx0.f129458e.rawQuery(sb.toString(), (String[]) null));
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI$f */
    public static class C44729f {

        /* renamed from: a */
        public MaskLayout f121332a;

        /* renamed from: b */
        public TextView f121333b;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6523h7;
    }

    public void initView() {
        String[] strArr;
        setMMTitle(this.f121322j);
        setBackBtn(new C44724a());
        C106742j1 j1Var = new C106742j1(true, true);
        this.f121321i = j1Var;
        j1Var.f319122j = new C44725b();
        addSearchMenu(true, j1Var);
        this.f121316d = (ListView) findViewById(C0966R.C0970id.b16);
        C48353j jVar = new C48353j();
        C48334c cVar = this.f121320h;
        if (!Util.isNullOrNil(this.f121319g)) {
            String[] split = this.f121319g.split(";");
            Log.m105919d("MicroMsg.AtSomeoneUI", "chatroom members name=[%s]", Arrays.toString(split));
            strArr = split;
        } else {
            strArr = null;
        }
        List linkedList = new LinkedList();
        if (!Util.isNullOrNil(this.f121318f)) {
            linkedList = Util.stringsToList(this.f121318f.split(";"));
        }
        this.f121317e = new C44728e(this, jVar, cVar, strArr, linkedList);
        this.f121316d.setOnItemClickListener(new C44726c());
        this.f121316d.setAdapter(this.f121317e);
        this.f121316d.setOnScrollListener(new C44727d(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f121318f = getIntent().getStringExtra("Block_list");
        this.f121319g = getIntent().getStringExtra("Chatroom_member_list");
        getIntent().getStringExtra("Chat_User");
        this.f121322j = getIntent().getStringExtra("Add_address_titile");
        this.f121323n = getIntent().getLongExtra("key_biz_chat_id", -1);
        C48334c a0 = C48009v0.Ax0().mo73042a0(this.f121323n);
        this.f121320h = a0;
        if (a0.field_ownerUserId.equals(C75592q0.m90789s())) {
            f121315o = true;
        }
        initView();
    }

    public void onDestroy() {
        this.f121317e.mo5580b();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C106742j1 j1Var = this.f121321i;
        if (j1Var != null) {
            j1Var.mo153850b();
        }
    }
}
