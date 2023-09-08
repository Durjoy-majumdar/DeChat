package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75949o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.contact.SnsSelectFromConvBoxUI */
public class SnsSelectFromConvBoxUI extends SnsSelectConversationUI {

    /* renamed from: P */
    public Intent f218883P;

    /* renamed from: Q */
    public List<String> f218884Q = new LinkedList();

    /* renamed from: com.tencent.mm.ui.contact.SnsSelectFromConvBoxUI$a */
    public static class C74448a extends C74526m1 implements MStorageEx.IOnStorageChange {

        /* renamed from: n */
        public Cursor f218885n;

        public C74448a(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2, boolean z3) {
            super((C74493g1) mMBaseSelectContactUI, list, z, z2, z3);
            mo7853r();
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().add(this);
        }

        public int getCount() {
            Cursor cursor = this.f218885n;
            if (cursor != null) {
                return cursor.getCount();
            }
            Log.m105920e("MicroMsg.ConvBoxTransmitUI.SnsSelectFromConvBoxAdapter", "getCount: dataCursor == null ");
            return 0;
        }

        /* renamed from: h */
        public C75922b mo7850h(int i) {
            if (!this.f218885n.moveToPosition(i)) {
                return null;
            }
            Class cls = C75700k0.class;
            C75949o oVar = new C75949o(i);
            C72976h2 h2Var = new C72976h2();
            h2Var.convertFrom(this.f218885n);
            C86709a0.m107528h();
            oVar.mo106181j(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69674W2(h2Var.getUsername()));
            if (oVar.f222600A == null) {
                C86709a0.m107528h();
                oVar.mo106181j(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69656H3(h2Var.getUsername()));
            }
            oVar.f222608e = true;
            return oVar;
        }

        /* renamed from: i */
        public void mo7851i() {
            mo103564g();
            Log.m105924i("MicroMsg.ConvBoxTransmitUI.SnsSelectFromConvBoxAdapter", "finish!");
            Cursor cursor = this.f218885n;
            if (cursor != null) {
                cursor.close();
                this.f218885n = null;
            }
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().remove(this);
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            mo7853r();
            notifyDataSetChanged();
        }

        /* renamed from: r */
        public void mo7853r() {
            Log.m105924i("MicroMsg.ConvBoxTransmitUI.SnsSelectFromConvBoxAdapter", "resetData");
            Cursor cursor = this.f218885n;
            if (cursor != null) {
                cursor.close();
                this.f218885n = null;
            }
            this.f218885n = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69738I(5, this.f219096j, "conversationboxservice", -1);
        }
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return new C74448a(this, (List<String>) null, true, true, false);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return null;
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return getString(C0966R.string.m_6);
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        C75922b j2 = mo103379N7().getItem(i - this.f218605d.getHeaderViewsCount());
        if (j2 != null && (str = j2.f222621r) != null) {
            Log.m105925i("MicroMsg.SnsSelectFromConvBoxUI", "ClickUser=%s", str);
            Intent intent = new Intent();
            intent.setClass(this, SnsSelectConversationMemberUI.class);
            intent.putExtra("no_result_tip", getContext().getString(C0966R.string.m_a));
            intent.putExtra("Select_Conv_User", Util.listToString(this.f218884Q, ","));
            intent.putExtra("select_chatroom_name", str);
            startActivityForResult(intent, 6);
            mo103487l8(this.f218884Q);
        }
    }

    /* renamed from: Z7 */
    public void mo66629Z7() {
        setResult(-1, this.f218883P);
        super.mo66629Z7();
    }

    /* renamed from: b8 */
    public void mo64526b8(ListView listView, int i) {
    }

    /* renamed from: g8 */
    public void mo103483g8() {
    }

    /* renamed from: k8 */
    public void mo103486k8() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f218883P = intent;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!Util.isNullOrNil(stringExtra)) {
                this.f218884Q.clear();
                this.f218884Q.addAll(Util.stringsToList(stringExtra.split(",")));
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("Select_Conv_User");
        List<String> linkedList = TextUtils.isEmpty(stringExtra) ? new LinkedList<>() : Util.stringsToList(stringExtra.split(","));
        this.f218884Q = linkedList;
        if (linkedList == null) {
            this.f218884Q = new ArrayList();
        }
        super.onCreate(bundle);
    }
}
