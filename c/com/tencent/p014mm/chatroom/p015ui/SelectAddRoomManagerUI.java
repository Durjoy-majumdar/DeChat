package com.tencent.p014mm.chatroom.p015ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.SelectMemberUI;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.tencent.mm.chatroom.ui.SelectAddRoomManagerUI */
public class SelectAddRoomManagerUI extends SelectMemberUI {

    /* renamed from: v */
    public static final /* synthetic */ int f108203v = 0;

    /* renamed from: u */
    public HashSet<String> f108204u = new HashSet<>();

    /* renamed from: com.tencent.mm.chatroom.ui.SelectAddRoomManagerUI$a */
    public class C40236a implements MenuItem.OnMenuItemClickListener {
        public C40236a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            SelectAddRoomManagerUI selectAddRoomManagerUI = SelectAddRoomManagerUI.this;
            int i = SelectAddRoomManagerUI.f108203v;
            selectAddRoomManagerUI.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(selectAddRoomManagerUI.f108225q);
            intent.putExtra("Select_Contact", Util.listToString(arrayList, ","));
            SelectAddRoomManagerUI.this.setResult(-1, intent);
            SelectAddRoomManagerUI.this.finish();
            SelectAddRoomManagerUI.this.hideVKB();
            return false;
        }
    }

    /* renamed from: J7 */
    public HashSet<String> mo62773J7() {
        return this.f108204u;
    }

    /* renamed from: K7 */
    public void mo62774K7() {
        super.mo62774K7();
        for (String next : this.f108222n.mo69790r2()) {
            if (this.f108222n.mo69793u2(next)) {
                this.f108204u.add(next);
            }
        }
    }

    /* renamed from: L7 */
    public boolean mo62775L7() {
        return true;
    }

    /* renamed from: N7 */
    public void mo62762N7(View view, int i, long j) {
        SelectMemberUI.C40254h hVar = (SelectMemberUI.C40254h) view.getTag();
        String f = hVar.f108254a.f108239b.mo62898f();
        Log.m105919d("MicroMsg.SelectAddRoomManagerUI", "[onItemClick] username:%s remark:%s", hVar.f108254a.f108239b.getUsername(), f, hVar.f108254a.f108239b.mo62909j3());
        hVar.f108259f.performClick();
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

    public void finish() {
        hideVKB();
        super.finish();
    }

    public void initView() {
        super.initView();
        setMMTitle(getString(C0966R.string.f361220i91));
        addTextOptionMenu(1, getString(C0966R.string.f8014z_), new C40236a(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        if (this.f108225q.size() > 0) {
            enableOptionMenu(1, true);
        } else {
            enableOptionMenu(1, false);
        }
    }
}
