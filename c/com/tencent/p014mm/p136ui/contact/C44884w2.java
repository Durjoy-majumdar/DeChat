package com.tencent.p014mm.p136ui.contact;

import ai3.C112793f;
import ai3.C67047d;
import ai3.C67048e;
import android.content.Context;
import android.database.Cursor;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74452a;
import com.tencent.p014mm.p136ui.contact.OpenIMAddressUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44655f;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import ge0.C32415b;
import he0.C76158j;
import java.util.HashSet;
import java.util.LinkedList;
import kg3.C76577a;
import p629ny.C76979h;
import re0.C36307d;
import zh3.C79331c;

/* renamed from: com.tencent.mm.ui.contact.w2 */
public class C44884w2 extends C74452a {

    /* renamed from: U */
    public HashSet<String> f121749U = new HashSet<>();

    /* renamed from: V */
    public String f121750V;

    /* renamed from: W */
    public OpenIMAddressUI.OpenIMAddressUIFragment f121751W;

    public C44884w2(Context context, String str, String str2, int i, boolean z, String str3) {
        super(context, str, str2, i, z);
        this.f121750V = str3;
    }

    /* renamed from: A */
    public void mo70174A(C44655f fVar, C74452a.C74455c cVar) {
        String str = fVar.field_descWordingId;
        if (!this.f121749U.contains(str)) {
            this.f121749U.add(str);
            ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(fVar.field_openImAppid, str);
        }
    }

    /* renamed from: C */
    public Cursor mo70175C() {
        long currentTimeMillis = System.currentTimeMillis();
        C36307d wx02 = ((C32415b) C86312j.m106911c(C32415b.class)).wx0();
        String str = this.f121750V;
        wx02.getClass();
        LinkedList linkedList = new LinkedList();
        Cursor rawQuery = wx02.f96659d.rawQuery("select distinct appid from OpenIMAppIdInfo where acctTypeId=? ", new String[]{str}, 2);
        if (rawQuery.moveToFirst()) {
            do {
                String string = rawQuery.getString(0);
                if (!Util.isNullOrNil(string)) {
                    linkedList.add(string);
                }
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        Cursor I3 = C97625j3.m125812b().mo105907v().mo69657I3(this.f218914y, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), linkedList);
        if (I3 instanceof C112793f) {
            I3 = new C67048e(new C67047d[]{(C67047d) C79331c.m96022a(), (C112793f) I3});
        }
        Log.m105918d("OpenIMContactAdapter", "createNewCursor : " + (System.currentTimeMillis() - currentTimeMillis));
        return I3;
    }

    /* renamed from: D */
    public String mo70176D(C44655f fVar, int i) {
        String str = fVar.field_descWording;
        return Util.isNullOrNil(str) ? "#" : str;
    }

    /* renamed from: E */
    public int mo70177E(C44655f fVar, int i) {
        if (fVar == null) {
            Log.m105921e("OpenIMContactAdapter", "contact is null, position:%d", Integer.valueOf(i));
            return -1;
        } else if (Util.isNullOrNil(fVar.field_descWording)) {
            return -1;
        } else {
            return fVar.field_descWording.hashCode();
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj == null || !(obj instanceof String)) {
            Log.m105919d("OpenIMContactAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
        } else if (mStorageEx != C97625j3.m125812b().mo105907v()) {
        } else {
            if (C72996z1.m85843n5((String) obj)) {
                this.f121751W.f218702o = true;
            } else {
                Log.m105918d("OpenIMContactAdapter", "newcursor is not openim ，return");
            }
        }
    }

    /* renamed from: z */
    public void mo70178z(C44655f fVar, C74452a.C74455c cVar) {
        CharSequence charSequence;
        fVar.getClass();
        try {
            if (C72996z1.m85843n5(fVar.mo69642d())) {
                charSequence = ((C76158j) C86312j.m106911c(C76158j.class)).D30(MMApplicationContext.getContext(), fVar.mo69639b(), fVar.field_openImAppid, C76577a.m92157h(this.f220760h, C0966R.dimen.f3927j7));
            } else {
                C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                Context context = this.f220760h;
                String b = fVar.mo69639b();
                String d = fVar.mo69642d();
                if (b == null || b.length() <= 0) {
                    b = d;
                }
                charSequence = hVar.op0(context, b, C76577a.m92157h(this.f220760h, C0966R.dimen.f3927j7));
            }
        } catch (Exception unused) {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        cVar.f218919b.setText(charSequence);
    }
}
