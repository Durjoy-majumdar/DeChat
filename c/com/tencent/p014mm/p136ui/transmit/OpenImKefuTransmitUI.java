package com.tencent.p014mm.p136ui.transmit;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75946n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.transmit.OpenImKefuTransmitUI */
public class OpenImKefuTransmitUI extends SelectConversationUI {

    /* renamed from: com.tencent.mm.ui.transmit.OpenImKefuTransmitUI$a */
    public static class C74874a extends C74526m1 implements MStorageEx.IOnStorageChange {

        /* renamed from: n */
        public Cursor f220136n;

        public C74874a(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2, boolean z3) {
            super((C74493g1) mMBaseSelectContactUI, list, z, z2, z3);
            mo7853r();
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().add(this);
        }

        public int getCount() {
            Cursor cursor = this.f220136n;
            if (cursor != null) {
                return cursor.getCount();
            }
            Log.m105920e("MicroMsg.OpenImKeFuTransmitAdapter", "getCount: dataCursor == null ");
            return 0;
        }

        /* renamed from: h */
        public C75922b mo7850h(int i) {
            if (!this.f220136n.moveToPosition(i)) {
                return null;
            }
            C75946n nVar = new C75946n(i);
            C72976h2 h2Var = new C72976h2();
            h2Var.convertFrom(this.f220136n);
            nVar.mo106181j(new C72996z1(h2Var.getUsername()));
            nVar.f222608e = this.f219057f;
            return nVar;
        }

        /* renamed from: i */
        public void mo7851i() {
            mo103564g();
            Log.m105924i("MicroMsg.OpenImKeFuTransmitAdapter", "finish!");
            Cursor cursor = this.f220136n;
            if (cursor != null) {
                cursor.close();
                this.f220136n = null;
            }
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().remove(this);
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            mo7853r();
            notifyDataSetChanged();
        }

        /* renamed from: r */
        public void mo7853r() {
            Log.m105924i("MicroMsg.OpenImKeFuTransmitAdapter", "resetData");
            Cursor cursor = this.f220136n;
            if (cursor != null) {
                cursor.close();
                this.f220136n = null;
            }
            this.f220136n = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69738I(6, this.f219096j, "opencustomerservicemsg", -1);
        }
    }

    /* renamed from: H8 */
    public boolean mo104105H8() {
        return false;
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return new C74874a(this, (List<String>) null, this.f220199r1, this.f220170U0, this.f220169U);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return null;
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return getString(C0966R.string.f361117hf3);
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        super.mo64517R7(adapterView, view, i, j);
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: Z7 */
    public void mo66629Z7() {
        if (this.f220170U0) {
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_User", Util.listToString(this.f220172V0, ","));
            setResult(0, intent);
        }
        super.mo66629Z7();
    }

    /* renamed from: b8 */
    public void mo64526b8(ListView listView, int i) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        boolean booleanExtra = getIntent().getBooleanExtra("KIsMultiSelect", false);
        this.f220170U0 = booleanExtra;
        if (booleanExtra) {
            String stringExtra = getIntent().getStringExtra("Select_Conv_User");
            List<String> linkedList = TextUtils.isEmpty(stringExtra) ? new LinkedList<>() : Util.stringsToList(stringExtra.split(","));
            this.f220172V0 = linkedList;
            if (linkedList == null) {
                this.f220172V0 = new ArrayList();
            }
            this.f220174W0 = new HashMap();
        }
        super.onCreate(bundle);
    }
}
