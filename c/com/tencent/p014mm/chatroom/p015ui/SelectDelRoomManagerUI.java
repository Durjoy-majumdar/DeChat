package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.SelectMemberUI;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nj3.C76879j;

/* renamed from: com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI */
public class SelectDelRoomManagerUI extends SelectMemberUI {

    /* renamed from: w */
    public static final /* synthetic */ int f108210w = 0;

    /* renamed from: u */
    public boolean f108211u = false;

    /* renamed from: v */
    public List<String> f108212v = new ArrayList();

    /* renamed from: com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI$a */
    public class C40240a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI$a$a */
        public class C40241a implements DialogInterface.OnClickListener {
            public C40241a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                SelectDelRoomManagerUI selectDelRoomManagerUI = SelectDelRoomManagerUI.this;
                int i2 = SelectDelRoomManagerUI.f108210w;
                selectDelRoomManagerUI.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(selectDelRoomManagerUI.f108225q);
                intent.putExtra("Select_Contact", Util.listToString(arrayList, ","));
                SelectDelRoomManagerUI.this.setResult(-1, intent);
                SelectDelRoomManagerUI.this.finish();
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI$a$b */
        public class C40242b implements DialogInterface.OnClickListener {
            public C40242b(C40240a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C40240a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (SelectDelRoomManagerUI.this.f108211u) {
                C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(SelectDelRoomManagerUI.this.f108223o);
                StringBuilder sb = new StringBuilder();
                SelectDelRoomManagerUI selectDelRoomManagerUI = SelectDelRoomManagerUI.this;
                selectDelRoomManagerUI.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(selectDelRoomManagerUI.f108225q);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Set<String> set = C45628s0.f123410p;
                    C86709a0.m107528h();
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get((String) it.next());
                    String n2 = !Util.isNullOrNil(z1Var.mo73969n2()) ? z1Var.mo73969n2() : Lo != null ? Lo.mo69789q2(z1Var.getUsername()) : null;
                    if (Util.isNullOrNil(n2)) {
                        n2 = z1Var.mo73969n2();
                    }
                    if (Util.isNullOrNil(n2)) {
                        n2 = z1Var.mo62909j3();
                    }
                    if (Util.isNullOrNil(n2)) {
                        n2 = z1Var.getUsername();
                    }
                    sb.append(n2);
                    sb.append("、");
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                SelectDelRoomManagerUI selectDelRoomManagerUI2 = SelectDelRoomManagerUI.this;
                C76879j.m92750u(selectDelRoomManagerUI2, selectDelRoomManagerUI2.getString(C0966R.string.i68, new Object[]{sb}), "", new C40241a(), new C40242b(this));
                return true;
            }
            Intent intent = new Intent();
            SelectDelRoomManagerUI selectDelRoomManagerUI3 = SelectDelRoomManagerUI.this;
            selectDelRoomManagerUI3.getClass();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(selectDelRoomManagerUI3.f108225q);
            intent.putExtra("Select_Contact", Util.listToString(arrayList2, ","));
            SelectDelRoomManagerUI.this.setResult(-1, intent);
            SelectDelRoomManagerUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public BaseAdapter mo62784H7() {
        return this.f108221j;
    }

    /* renamed from: K7 */
    public void mo62774K7() {
        super.mo62774K7();
        String stringExtra = getIntent().getStringExtra("RoomManagers");
        if (stringExtra != null) {
            for (String add : stringExtra.split(",")) {
                ((ArrayList) this.f108212v).add(add);
            }
        }
        this.f108211u = true;
    }

    /* renamed from: L7 */
    public boolean mo62775L7() {
        return true;
    }

    /* renamed from: M7 */
    public List<String> mo62785M7() {
        return this.f108212v;
    }

    /* renamed from: N7 */
    public void mo62762N7(View view, int i, long j) {
        ((SelectMemberUI.C40254h) view.getTag()).f108259f.performClick();
    }

    /* renamed from: O7 */
    public void mo62776O7(View view, LinearLayout linearLayout, ImageButton imageButton, int i, String str) {
        super.mo62776O7(view, linearLayout, imageButton, i, str);
        if (this.f108225q.size() > 0) {
            enableOptionMenu(1, true);
        } else {
            enableOptionMenu(1, false);
        }
    }

    /* renamed from: P7 */
    public boolean mo62779P7() {
        return false;
    }

    public void finish() {
        hideVKB();
        super.finish();
    }

    public void initView() {
        super.initView();
        setMMTitle(getString(this.f108211u ? C0966R.string.f361221i92 : C0966R.string.f361220i91));
        addTextOptionMenu(1, getString(this.f108211u ? C0966R.string.bye : C0966R.string.f8014z_), new C40240a(), (View.OnLongClickListener) null, this.f108211u ? MMActivityController.C73075r.RED : MMActivityController.C73075r.GREEN);
        if (this.f108225q.size() > 0) {
            enableOptionMenu(1, true);
        } else {
            enableOptionMenu(1, false);
        }
    }
}
