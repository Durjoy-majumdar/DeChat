package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.SelectMemberUI;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gl3.C75922b;
import gl3.C75929e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lc3.C10485b;
import nj3.C76879j;
import te3.C49889is;
import te3.C50165kq2;

/* renamed from: com.tencent.mm.chatroom.ui.SelectRoomFollowMemberManagerUI */
public class SelectRoomFollowMemberManagerUI extends SelectMemberUI {

    /* renamed from: v */
    public static final /* synthetic */ int f108262v = 0;

    /* renamed from: u */
    public HashSet<String> f108263u = new HashSet<>();

    /* renamed from: com.tencent.mm.chatroom.ui.SelectRoomFollowMemberManagerUI$a */
    public class C40255a implements MenuItem.OnMenuItemClickListener {
        public C40255a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            SelectRoomFollowMemberManagerUI selectRoomFollowMemberManagerUI = SelectRoomFollowMemberManagerUI.this;
            int i = SelectRoomFollowMemberManagerUI.f108262v;
            selectRoomFollowMemberManagerUI.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(selectRoomFollowMemberManagerUI.f108225q);
            intent.putExtra("Select_Contact", Util.listToString(arrayList, ","));
            SelectRoomFollowMemberManagerUI.this.setResult(-1, intent);
            SelectRoomFollowMemberManagerUI.this.finish();
            return false;
        }
    }

    /* renamed from: K7 */
    public void mo62774K7() {
        LinkedList<C49889is> linkedList;
        super.mo62774K7();
        C50165kq2 kq22 = this.f108222n.field_localChatRoomWatchMembers;
        if (kq22 != null && (linkedList = kq22.f136988e) != null) {
            Iterator<C49889is> it = linkedList.iterator();
            while (it.hasNext()) {
                C49889is next = it.next();
                if (!Util.isNullOrNil(next.f135632d) && !this.f108263u.contains(next.f135632d) && this.f108222n.mo69790r2().contains(next.f135632d)) {
                    this.f108263u.add(next.f135632d);
                }
            }
            this.f108225q.addAll(this.f108263u);
        }
    }

    /* renamed from: L7 */
    public boolean mo62775L7() {
        return true;
    }

    /* renamed from: M7 */
    public List<String> mo62785M7() {
        return this.f108222n.mo69790r2();
    }

    /* renamed from: N7 */
    public void mo62762N7(View view, int i, long j) {
        String str;
        Class cls = C10485b.class;
        if (this.f108215d.getAdapter() == this.f108220i) {
            C75929e.C75930a aVar = (C75929e.C75930a) view.getTag();
            ImageView imageView = aVar.f222649b;
            str = (imageView == null || !(imageView.getTag() instanceof String)) ? "" : (String) aVar.f222649b.getTag();
        } else {
            SelectMemberUI.C40254h hVar = (SelectMemberUI.C40254h) view.getTag();
            String username = hVar.f108254a.f108239b.getUsername();
            Log.m105919d("MicroMsg.SelectAddRoomManagerUI", "[onItemClick] username:%s remark:%s", username, hVar.f108254a.f108239b.mo62898f(), hVar.f108254a.f108239b.mo62909j3());
            str = username;
        }
        if (this.f108225q.contains(str) || this.f108225q.size() < Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("RoomLimitWatchMemberMax"), 4)) {
            if (this.f108215d.getAdapter() == this.f108220i) {
                ImageView imageView2 = ((C75929e.C75930a) view.getTag()).f222649b;
                if (imageView2 != null && (imageView2.getTag() instanceof String)) {
                    if (this.f108225q.contains(str)) {
                        this.f108225q.remove(str);
                    } else {
                        this.f108225q.add(str);
                    }
                    this.f108220i.notifyDataSetChanged();
                }
            } else {
                SelectMemberUI.C40254h hVar2 = (SelectMemberUI.C40254h) view.getTag();
                if (this.f108225q.contains(str)) {
                    this.f108225q.remove(str);
                    hVar2.f108258e.setImageResource(C0966R.C0969drawable.f4823ny);
                } else {
                    this.f108225q.add(str);
                    hVar2.f108258e.setImageResource(C0966R.raw.checkbox_selected);
                }
            }
            mo62805Q7(true);
            return;
        }
        AppCompatActivity context = getContext();
        C76879j.m92711E(context, getString(C0966R.string.i9j, new Object[]{Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("RoomLimitWatchMemberMax"), 4) + ""}), "", getString(C0966R.string.f8028zq), false, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: O7 */
    public void mo62776O7(View view, LinearLayout linearLayout, ImageButton imageButton, int i, String str) {
        mo62762N7(view, i, 0);
    }

    /* renamed from: Q7 */
    public final void mo62805Q7(boolean z) {
        boolean z2;
        if (this.f108225q.size() > 0) {
            updateOptionMenuText(1, getString(C0966R.string.f8014z_) + "(" + this.f108225q.size() + ")");
        } else {
            updateOptionMenuText(1, getString(C0966R.string.f8014z_));
        }
        if (this.f108225q.size() == this.f108263u.size()) {
            Iterator<String> it = this.f108225q.iterator();
            z2 = true;
            while (it.hasNext()) {
                if (!this.f108263u.contains(it.next())) {
                    z2 = false;
                }
            }
            if (!z2) {
                Iterator<String> it4 = this.f108263u.iterator();
                while (it4.hasNext()) {
                    if (!this.f108225q.contains(it4.next())) {
                        z2 = false;
                    }
                }
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            enableOptionMenu(1, z);
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
        setMMTitle(getString(C0966R.string.i9f));
        addTextOptionMenu(1, getString(C0966R.string.f8014z_), new C40255a(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        mo62805Q7(false);
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
