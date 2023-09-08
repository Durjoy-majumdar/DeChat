package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.SelectMemberUI;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import gl3.C75922b;
import gl3.C75929e;
import java.util.ArrayList;
import java.util.HashSet;
import nj3.C76879j;

/* renamed from: com.tencent.mm.chatroom.ui.SelectDelMemberUI */
public class SelectDelMemberUI extends SelectMemberUI {

    /* renamed from: v */
    public static final /* synthetic */ int f108206v = 0;

    /* renamed from: u */
    public int f108207u;

    /* renamed from: com.tencent.mm.chatroom.ui.SelectDelMemberUI$a */
    public class C40237a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.chatroom.ui.SelectDelMemberUI$a$a */
        public class C40238a implements DialogInterface.OnClickListener {
            public C40238a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                SelectDelMemberUI selectDelMemberUI = SelectDelMemberUI.this;
                int i2 = SelectDelMemberUI.f108206v;
                selectDelMemberUI.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(selectDelMemberUI.f108225q);
                intent.putExtra("Select_Contact", Util.listToString(arrayList, ","));
                SelectDelMemberUI.this.setResult(-1, intent);
                SelectDelMemberUI.this.finish();
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.SelectDelMemberUI$a$b */
        public class C40239b implements DialogInterface.OnClickListener {
            public C40239b(C40237a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C40237a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectDelMemberUI selectDelMemberUI = SelectDelMemberUI.this;
            C76879j.m92750u(selectDelMemberUI, selectDelMemberUI.getString(C0966R.string.i67), "", new C40238a(), new C40239b(this));
            return false;
        }
    }

    /* renamed from: I7 */
    public HashSet<String> mo62778I7() {
        HashSet<String> hashSet = new HashSet<>();
        if (this.f108222n.mo69796x2(C75592q0.m90789s())) {
            return hashSet;
        }
        for (String next : this.f108222n.mo69790r2()) {
            if (this.f108222n.mo69793u2(next) || this.f108222n.mo69796x2(next)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: K7 */
    public void mo62774K7() {
        super.mo62774K7();
        this.f108207u = getIntent().getIntExtra("room_member_count", 0);
    }

    /* renamed from: L7 */
    public boolean mo62775L7() {
        return true;
    }

    /* renamed from: N7 */
    public void mo62762N7(View view, int i, long j) {
        if (this.f108215d.getAdapter() == this.f108220i) {
            C75929e.C75930a aVar = (C75929e.C75930a) view.getTag();
            ImageView imageView = aVar.f222649b;
            if (imageView != null && (imageView.getTag() instanceof String)) {
                String str = (String) aVar.f222649b.getTag();
                if (this.f108225q.contains(str)) {
                    this.f108225q.remove(str);
                } else {
                    this.f108225q.add(str);
                }
                mo62780Q7();
                this.f108220i.notifyDataSetChanged();
                return;
            }
            return;
        }
        ((SelectMemberUI.C40254h) view.getTag()).f108259f.performClick();
    }

    /* renamed from: O7 */
    public void mo62776O7(View view, LinearLayout linearLayout, ImageButton imageButton, int i, String str) {
        super.mo62776O7(view, linearLayout, imageButton, i, str);
        mo62780Q7();
    }

    /* renamed from: P7 */
    public boolean mo62779P7() {
        return false;
    }

    /* renamed from: Q7 */
    public final void mo62780Q7() {
        if (this.f108225q.size() > 0) {
            updateOptionMenuText(1, getString(C0966R.string.bye) + "(" + this.f108225q.size() + ")");
            enableOptionMenu(1, true);
            return;
        }
        updateOptionMenuText(1, getString(C0966R.string.bye));
        enableOptionMenu(1, false);
    }

    public void finish() {
        hideVKB();
        super.finish();
    }

    public void initView() {
        super.initView();
        setMMTitle(getString(C0966R.string.f361219i90) + "(" + this.f108207u + ")");
        addTextOptionMenu(1, getString(C0966R.string.bye), new C40237a(), (View.OnLongClickListener) null, MMActivityController.C73075r.RED);
        mo62780Q7();
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f108225q.contains(str);
    }
}
