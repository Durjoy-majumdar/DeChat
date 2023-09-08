package sj3;

import android.database.Cursor;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import gl3.C75922b;
import gl3.C75957r;
import java.util.List;
import rb0.C48009v0;
import sb0.C48327a;
import sb0.C48334c;
import sb0.C48353j;

/* renamed from: sj3.b0 */
public class C48399b0 extends C74526m1 implements MStorageEx.IOnStorageChange {

    /* renamed from: n */
    public Cursor f129570n;

    /* renamed from: o */
    public String f129571o;

    public C48399b0(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, String str) {
        super(mMBaseSelectContactUI, list, z, false);
        Log.m105924i("MicroMsg.RecentConversationAdapter", "create!");
        this.f129571o = str;
        mo7853r();
    }

    public int getCount() {
        return this.f129570n.getCount() + 1;
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        if (i == 0) {
            C75957r rVar = new C75957r(i);
            rVar.f222731x = this.f219055d.getActivity().getResources().getString(C0966R.string.ij9);
            return rVar;
        } else if (i <= 0 || !this.f129570n.moveToPosition((i + 0) - 1)) {
            Log.m105921e("MicroMsg.RecentConversationAdapter", "create Data Item Error position=%d", Integer.valueOf(i));
            return null;
        } else {
            C77716a aVar = new C77716a(i);
            C48327a aVar2 = new C48327a();
            aVar2.convertFrom(this.f129570n);
            if (aVar.f226506C != -1) {
                return aVar;
            }
            aVar.f226506C = aVar2.field_bizChatId;
            C48334c a0 = C48009v0.Ax0().mo73042a0(aVar2.field_bizChatId);
            if (a0.mo73037p2()) {
                aVar.f222601x = a0.field_chatName;
                aVar.f226505B = a0.field_headImageUrl;
                aVar.f222602y = a0.field_brandUserName;
            } else {
                C48353j jVar = C48009v0.Bx0().get(a0.field_bizChatServId);
                if (jVar != null) {
                    aVar.f222601x = jVar.field_userName;
                    aVar.f226505B = jVar.field_headImageUrl;
                    aVar.f222602y = jVar.field_brandUserName;
                }
            }
            if (Util.isNullOrNil(aVar.f222601x)) {
                aVar.f222601x = this.f219055d.getActivity().getResources().getString(C0966R.string.i6z);
            }
            if (!Util.isNullOrNil(aVar.f222602y)) {
                return aVar;
            }
            aVar.f222602y = aVar2.field_brandUserName;
            return aVar;
        }
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Log.m105924i("MicroMsg.RecentConversationAdapter", "finish!");
        Cursor cursor = this.f129570n;
        if (cursor != null) {
            cursor.close();
            this.f129570n = null;
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        mo7853r();
        notifyDataSetChanged();
    }

    /* renamed from: r */
    public void mo7853r() {
        Log.m105924i("MicroMsg.RecentConversationAdapter", "resetData");
        Cursor cursor = this.f129570n;
        if (cursor != null) {
            cursor.close();
            this.f129570n = null;
        }
        this.f129570n = C48009v0.Dx0().mo73022Ow(this.f129571o);
    }
}
