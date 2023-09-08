package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.p136ui.contact.C44882p1;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74536o1;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44665r4;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import gl3.C75921a;
import gl3.C75922b;
import he0.C76158j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kv1.C99254i;
import kv1.C99260q;
import lv1.C99664b;
import lv1.C99667f;
import o40.C61926c;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.ui.chatting.AtSomeoneUI */
public class AtSomeoneUI extends MMActivity implements C74493g1, C74498h1.C44878a {

    /* renamed from: q */
    public static final /* synthetic */ int f121496q = 0;

    /* renamed from: d */
    public ListView f121497d;

    /* renamed from: e */
    public C74536o1 f121498e;

    /* renamed from: f */
    public C44770e f121499f;

    /* renamed from: g */
    public String f121500g;

    /* renamed from: h */
    public String f121501h;

    /* renamed from: i */
    public C44661m1 f121502i;

    /* renamed from: j */
    public String f121503j;

    /* renamed from: n */
    public C106742j1 f121504n;

    /* renamed from: o */
    public TextView f121505o;

    /* renamed from: p */
    public String f121506p;

    /* renamed from: com.tencent.mm.ui.chatting.AtSomeoneUI$a */
    public class C44766a implements MenuItem.OnMenuItemClickListener {
        public C44766a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AtSomeoneUI.this.setResult(0);
            AtSomeoneUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AtSomeoneUI$b */
    public class C44767b implements C106742j1.C106756o {
        public C44767b() {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            Log.m105918d("MicroMsg.AtSomeoneUI", "onQuitSearch()");
            C74536o1 o1Var = AtSomeoneUI.this.f121498e;
            if (o1Var != null) {
                C99664b bVar = o1Var.f219107o;
                if (bVar != null) {
                    ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(bVar);
                    o1Var.f219107o = null;
                }
                C74498h1.C44878a aVar = o1Var.f219051i;
                if (aVar != null) {
                    aVar.mo62789t6("", 0, true);
                }
                C61926c.m72668M(new C44882p1(o1Var));
            }
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
            AtSomeoneUI.this.f121498e.mo103590v(str);
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AtSomeoneUI$c */
    public class C44768c implements AdapterView.OnItemClickListener {
        public C44768c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/AtSomeoneUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            ListAdapter adapter = AtSomeoneUI.this.f121497d.getAdapter();
            AtSomeoneUI atSomeoneUI = AtSomeoneUI.this;
            String str = null;
            if (adapter == atSomeoneUI.f121499f) {
                Intent intent = new Intent();
                if (i == 0) {
                    int i2 = AtSomeoneUI.f121496q;
                }
                C44770e eVar = AtSomeoneUI.this.f121499f;
                int i3 = AtSomeoneUI.f121496q;
                C72996z1 z1Var = (C72996z1) eVar.getItem(i + 0);
                C44661m1 m1Var = AtSomeoneUI.this.f121502i;
                String username = z1Var.getUsername();
                if (m1Var != null) {
                    str = m1Var.mo69789q2(username);
                }
                if (Util.isNullOrNil(str)) {
                    str = z1Var.mo62909j3();
                }
                intent.putExtra("select_raw_user_name", z1Var.getUsername());
                intent.putExtra("Select_Conv_User", str);
                AtSomeoneUI.this.setResult(-1, intent);
                AtSomeoneUI.this.finish();
            } else if (atSomeoneUI.f121497d.getAdapter() == AtSomeoneUI.this.f121498e) {
                Intent intent2 = new Intent();
                C72996z1 z1Var2 = ((C75921a) AtSomeoneUI.this.f121498e.getItem(i)).f222600A;
                C44661m1 m1Var2 = AtSomeoneUI.this.f121502i;
                String username2 = z1Var2.getUsername();
                if (m1Var2 != null) {
                    str = m1Var2.mo69789q2(username2);
                }
                if (Util.isNullOrNil(str)) {
                    str = z1Var2.mo62909j3();
                }
                intent2.putExtra("select_raw_user_name", z1Var2.getUsername());
                intent2.putExtra("Select_Conv_User", str);
                AtSomeoneUI.this.setResult(-1, intent2);
                AtSomeoneUI.this.finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AtSomeoneUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AtSomeoneUI$d */
    public class C44769d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f121510d;

        /* renamed from: e */
        public final /* synthetic */ int f121511e;

        public C44769d(String str, int i) {
            this.f121510d = str;
            this.f121511e = i;
        }

        public void run() {
            if (Util.isNullOrNil(this.f121510d)) {
                AtSomeoneUI atSomeoneUI = AtSomeoneUI.this;
                atSomeoneUI.f121497d.setAdapter(atSomeoneUI.f121499f);
                AtSomeoneUI.this.f121505o.setVisibility(8);
                return;
            }
            AtSomeoneUI atSomeoneUI2 = AtSomeoneUI.this;
            atSomeoneUI2.f121497d.setAdapter(atSomeoneUI2.f121498e);
            if (this.f121511e > 0) {
                AtSomeoneUI.this.f121505o.setVisibility(8);
                return;
            }
            AtSomeoneUI atSomeoneUI3 = AtSomeoneUI.this;
            TextView textView = atSomeoneUI3.f121505o;
            String string = atSomeoneUI3.getString(C0966R.string.igo);
            String string2 = AtSomeoneUI.this.getString(C0966R.string.ign);
            String str = this.f121510d;
            textView.setText(C99254i.m129307d(string, string2, C99667f.m130088a(str, str, false, false)).f292107a);
            AtSomeoneUI.this.f121505o.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AtSomeoneUI$e */
    public static class C44770e extends C6975i1<C72996z1> {

        /* renamed from: o */
        public String[] f121513o;

        /* renamed from: p */
        public List<String> f121514p;

        /* renamed from: q */
        public C44661m1 f121515q;

        public C44770e(Context context, C72996z1 z1Var, C44661m1 m1Var, String[] strArr, List<String> list) {
            super(context, z1Var);
            this.f121515q = m1Var;
            this.f121513o = strArr;
            this.f121514p = list;
            BitmapUtil.transformDrawableToBitmap(context.getResources().getDrawable(C0966R.raw.at_all_avater));
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C72996z1 z1Var = (C72996z1) obj;
            C44668u3 v = C97625j3.m125812b().mo105907v();
            int i = C72996z1.f214113Y1;
            C72996z1 W2 = v.mo69674W2(cursor.getString(cursor.getColumnIndex("username")));
            if (W2 != null) {
                return W2;
            }
            C72996z1 z1Var2 = new C72996z1();
            z1Var2.convertFrom(cursor);
            C97625j3.m125812b().mo105907v().mo69690c4(z1Var2);
            return z1Var2;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C44771f fVar;
            String str = null;
            if (view == null) {
                view = View.inflate(this.f24696e, C0966R.C0971layout.f6522h6, (ViewGroup) null);
                fVar = new C44771f();
                fVar.f121516a = (MaskLayout) view.findViewById(C0966R.C0970id.f6178zh);
                fVar.f121517b = (TextView) view.findViewById(C0966R.C0970id.f6179zi);
                ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.br8);
                view.setTag(fVar);
            } else {
                fVar = (C44771f) view.getTag();
            }
            if (i == 0) {
                int i2 = AtSomeoneUI.f121496q;
            }
            int i3 = AtSomeoneUI.f121496q;
            C72996z1 z1Var = (C72996z1) getItem(i + 0);
            fVar.f121517b.setTextColor(C76577a.m92154e(this.f24696e, !C45628s0.m50812z(z1Var.getUsername()) ? C0966R.color.a4r : C0966R.color.a4s));
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) fVar.f121516a.getContentView(), z1Var.getUsername());
            if (z1Var.mo73953E2() != 0) {
                fVar.f121516a.setMaskDrawable((Drawable) null);
            } else {
                fVar.f121516a.setMaskDrawable((Drawable) null);
            }
            if (!Util.isNullOrNil(z1Var.mo73969n2())) {
                str = z1Var.mo73969n2();
            } else {
                C44661m1 m1Var = this.f121515q;
                String username = z1Var.getUsername();
                if (m1Var != null) {
                    str = m1Var.mo69789q2(username);
                }
            }
            if (Util.isNullOrNil(str)) {
                str = z1Var.mo62909j3();
            }
            String str2 = str;
            if (C72996z1.m85843n5(z1Var.getUsername())) {
                ((C76158j) C86312j.m106911c(C76158j.class)).mo106359LW(fVar.f121517b.getContext(), fVar.f121517b, str2, z1Var.mo73980x2(), z1Var.mo73976t2(), (int) fVar.f121517b.getTextSize());
            } else {
                fVar.f121517b.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f24696e, str2, fVar.f121517b.getTextSize()));
            }
            return view;
        }

        /* renamed from: i */
        public int mo6470i() {
            int i = AtSomeoneUI.f121496q;
            return 0;
        }

        /* renamed from: k */
        public /* bridge */ /* synthetic */ Object mo7995k() {
            return null;
        }

        /* renamed from: l */
        public void mo1332l() {
            mo5580b();
            mo1333o();
        }

        /* renamed from: n */
        public boolean mo7996n(int i) {
            return false;
        }

        /* renamed from: o */
        public void mo1333o() {
            C44668u3 v = C97625j3.m125812b().mo105907v();
            String[] strArr = this.f121513o;
            C44661m1 m1Var = this.f121515q;
            mo7998r(v.mo69712l4(strArr, "@all.chatroom", (String) null, (List<String>) null, this.f121514p));
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AtSomeoneUI$f */
    public static class C44771f {

        /* renamed from: a */
        public MaskLayout f121516a;

        /* renamed from: b */
        public TextView f121517b;
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        return false;
    }

    /* renamed from: f6 */
    public ListView mo7831f6() {
        return this.f121497d;
    }

    public Activity getActivity() {
        return this;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6523h7;
    }

    public void initView() {
        String[] strArr;
        setMMTitle(this.f121506p);
        setBackBtn(new C44766a());
        boolean z = true;
        C106742j1 j1Var = new C106742j1(true, true);
        this.f121504n = j1Var;
        j1Var.f319122j = new C44767b();
        addSearchMenu(true, j1Var);
        this.f121497d = (ListView) findViewById(C0966R.C0970id.b16);
        this.f121505o = (TextView) findViewById(C0966R.C0970id.cjf);
        HashSet hashSet = new HashSet();
        hashSet.add(C75592q0.m90789s());
        this.f121498e = new C74536o1(this, this.f121503j, 0, false, hashSet);
        C72996z1 z1Var = new C72996z1();
        C44661m1 m1Var = this.f121502i;
        if (!Util.isNullOrNil(this.f121501h)) {
            strArr = this.f121501h.split(",");
            Log.m105919d("MicroMsg.AtSomeoneUI", "chatroom members name=[%s]", Arrays.toString(strArr));
        } else {
            strArr = null;
        }
        if (strArr == null && this.f121502i != null) {
            Log.m105928w("MicroMsg.AtSomeoneUI", "[getChatroomMember] chatroomMemberList is null!");
            strArr = Util.listToString(this.f121502i.mo69790r2(), ",").split(",");
        }
        String[] strArr2 = strArr;
        if (strArr2 == null) {
            Object[] objArr = new Object[1];
            if (this.f121502i != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105921e("MicroMsg.AtSomeoneUI", "WTF! member is null? %s", objArr);
        }
        List linkedList = new LinkedList();
        if (!Util.isNullOrNil(this.f121500g)) {
            linkedList = Util.stringsToList(this.f121500g.split(","));
        }
        List list = linkedList;
        C44665r4 jo = ((C44667s4) C97625j3.m125812b().mo105877C()).mo69821jo("@t.qq.com");
        if (jo != null) {
            list.add(jo.f121095b);
        }
        this.f121499f = new C44770e(this, z1Var, m1Var, strArr2, list);
        this.f121498e.f219051i = this;
        this.f121497d.setOnItemClickListener(new C44768c());
        this.f121497d.setAdapter(this.f121499f);
    }

    /* renamed from: n1 */
    public String mo7833n1(C75922b bVar) {
        return null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.f121500g = getIntent().getStringExtra("Block_list");
        this.f121501h = getIntent().getStringExtra("Chatroom_member_list");
        this.f121503j = getIntent().getStringExtra("Chat_User");
        this.f121506p = getIntent().getStringExtra("Add_address_titile");
        C44661m1 Lo = ((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(this.f121503j);
        this.f121502i = Lo;
        if (!(Lo == null || (str = Lo.field_roomowner) == null)) {
            str.equals(C75592q0.m90789s());
        }
        initView();
    }

    public void onDestroy() {
        this.f121499f.mo5580b();
        this.f121498e.mo7851i();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C106742j1 j1Var = this.f121504n;
        if (j1Var != null) {
            j1Var.mo153850b();
        }
    }

    /* renamed from: t6 */
    public void mo62789t6(String str, int i, boolean z) {
        runOnUiThread(new C44769d(str, i));
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        return false;
    }
}
